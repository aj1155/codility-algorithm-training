package lesson6;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,-2,-3,-7,-8,4};
		System.out.println(solution(a));
	}
	
	public static int solution(int A[]){
		Arrays.sort(A);
		int N = A.length;
		
		int maxProduct = A[N - 1] * A[N - 2] * A[N - 3];
		
		if(A[0]<0 && A[1]<0){
			int minPro = A[0]*A[1]*A[N-1];
			maxProduct = (maxProduct < minPro) ? minPro : maxProduct;
		}
		return maxProduct;
	}

}
