package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class RComparator implements Comparator{
	
	enum Choice { document,interview}
	Choice choice;
	
	public RComparator(Choice choice){
		this.choice = choice;
	}
	@Override
	public int compare(Object o1, Object o2) {
		Recruit r1 = (Recruit)o1;
		Recruit r2 = (Recruit)o2;
		
		switch(choice){
			case document: return r1.document - r2.document;
			default: return r1.interview - r2.interview;
		}
	}
	
}

class Recruit {
	int document;
	int interview;
	
	public Recruit(int dc,int it){
		document = dc;
		interview = it;
	}
	
	@Override
	public String toString(){
		return String.format("%d %d", document,interview);
	}
	
}

public class Baekjoon1946 {

	public static void main(String[] args) {
		List<Recruit> list = new ArrayList<Recruit>();
		Recruit r1 = new Recruit(3,6);
		Recruit r2 = new Recruit(7,3);
		Recruit r3 = new Recruit(4,2);
		Recruit r4 = new Recruit(1,4);
		Recruit r5 = new Recruit(5,7);
		Recruit r6 = new Recruit(2,5);
		Recruit r7 = new Recruit(6,1);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		list.add(r5);
		list.add(r6);
		list.add(r7);
		System.out.println(solution(list.toArray(new Recruit[0])));
		
	}
	public static int solution(Recruit[] arr){
		Arrays.sort(arr,new RComparator(RComparator.Choice.document));
		int count=1;
		List<Recruit> list = new ArrayList<Recruit>();
		Recruit top = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i].interview<top.interview){
				list.add(arr[i]);
			}
		}
		if(list.size()>0){
			arr = list.toArray(new Recruit[0]);
			Arrays.sort(arr,new RComparator(RComparator.Choice.interview));
			top = arr[0];
			count++;
			list.clear();
			for(int i=1;i<arr.length;i++){
				if(arr[i].document<top.document){
					list.add(arr[i]);
				}
			}
			count += list.size();
		}
		
		return count;
	}

}
