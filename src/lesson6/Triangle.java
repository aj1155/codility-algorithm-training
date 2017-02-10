package lesson6;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[] = {10,50,5,1};
		System.out.println(solution(temp));
		
	}
	
	public static int solution(int[] A){
		Arrays.sort(A);
		for(int i=0;i<A.length-2;i++){
			if((long)A[i]+A[i+1]>A[i+2]){
				return 1;
			}
		}
		return 0;
	}

}
