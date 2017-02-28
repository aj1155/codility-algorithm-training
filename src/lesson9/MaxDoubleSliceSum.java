package lesson9;

import java.util.Arrays;

public class MaxDoubleSliceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,6,-1,4,5,-1,2};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] A){
		int[] fromLiftDoubleSlices = new int[A.length];
		int[] fromRightDoubleSlices = new int[A.length];
		int max_ending = 0;
		for (int i = 1; i < A.length - 1; i++) {
			max_ending = Math.max(0, max_ending + A[i]);
			fromLiftDoubleSlices[i] = max_ending;
		}
		System.out.println(Arrays.toString(fromLiftDoubleSlices));
		max_ending = 0;
		for (int i = A.length - 2; i > 0; i--) {
			max_ending = Math.max(0, max_ending + A[i]);
			fromRightDoubleSlices[i] = max_ending;
		}
		System.out.println(Arrays.toString(fromRightDoubleSlices));
		int maxSum = 0;
		for (int i = 1; i < A.length - 1; i++) {
			maxSum = Math.max(maxSum, fromLiftDoubleSlices[i - 1] + fromRightDoubleSlices[i + 1]);
		}
		return maxSum;
	}

}
