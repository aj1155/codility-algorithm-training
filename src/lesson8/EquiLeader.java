package lesson8;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,4,4,4,2};
		System.out.println(solution(arr));
	}
	public static int solution(int[] A){
		int leader=0;
		int front=0;
		int back=0;
		int maxValue=0;
		int maxValueCount=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int num : A){
			if(!map.containsKey(num)){
				map.put(num, 1);
			}else{
				int current = map.get(num)+1;
				map.put(num,current);
				if(current>maxValueCount){
					maxValueCount = current;
					maxValue = num;
				}
			}
		}
		
		for(int i=0;i<A.length;i++){
			if(A[i]==maxValue){
				front++;
				back = maxValueCount-front;
			}
			if(front>(i+1)/2 && back>(A.length-(i+1))/2){
				leader++;
			}
		}
		
		return leader;
	}

}
