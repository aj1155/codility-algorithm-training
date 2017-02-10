package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class SausageComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Sausage s1 = (Sausage)o1;
		Sausage s2 = (Sausage)o2;
		int result=0;
		result = s1.sl - s2.sl;
		if(result==0){
			result = s1.sw-s2.sw;
		}
		return result;
	}
	
}

class Sausage{
	int sl;
	int sw;
	
	public Sausage(int sl,int sw){
		this.sl = sl;
		this.sw = sw;
	}
	
	@Override
	public String toString(){
		return String.format("%d %d", sl,sw);
	}
}

public class SausageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int l;
		int w;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		List<Sausage> list = new ArrayList<Sausage>();
		while(num>0){
			l = input.nextInt();
			w = input.nextInt();
			Sausage s = new Sausage(l,w);
			list.add(s);
			num--;
		}
		
		System.out.println(solution(list.toArray(new Sausage[0])));
	}
	
	public static int solution(Sausage[] A){
		int count=0;
		count++;
		Arrays.sort(A,new SausageComparator());
		List<Sausage> list = new ArrayList<Sausage>();
		for(int i=0;i<A.length-1;i++){
			if(A[i].sw>A[i+1].sw){
				list.add(A[i+1]);
			}
		}
		if(list.size()>0){
			count +=solution(list.toArray(new Sausage[0]));
		}
		
		return count;
	}
	


}
