package lesson4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingInteger {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		System.out.println(solution(arr));

	}
	public static int solution(int[] A){
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		
	
		for(int i: A){
			if(!hm.containsKey(i)){
				hm.put(i, 1);
			}
		}
		
		for(int i=1;i<=A.length;i++){
			if(!hm.containsKey(i)){
				return i;
			}
		}
		Arrays.sort(A);
		return A[A.length-1]+1;
		
		

		
		
	}

}
