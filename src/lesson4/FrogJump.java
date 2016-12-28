package lesson4;

import java.util.HashMap;

public class FrogJump {

	public static void main(String[] args) {
		int[] arr = {1,3,1,3,2,1,3};
		System.out.println(solution(3,arr));

	}
	public static int solution(int X,int[] A){
		
		int count=X;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<A.length;i++){
			
			if(!hm.containsKey(A[i]) && A[i]<=X){
				hm.put(A[i], 1);
				count--;
			}
			if(count ==0){
				return i;
			}
			
		}
		return -1;
	}

}
