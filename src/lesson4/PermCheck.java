package lesson4;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		int[] arr = {1,2,1,4};
		System.out.println(solution(arr));

	}
	
	public static int solution(int[] A){
	
	
		
		Arrays.sort(A);
		for(int i=0;i<A.length;i++){
			if(A[i]!=i+1){
				return 0;
			}
		}
		return 1;
	}

}
