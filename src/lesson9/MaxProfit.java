package lesson9;

import java.util.Arrays;

public class MaxProfit {

	public static void main(String[] args) {
		int[] arr = {23171,21011,21123,21366,21013,21367};
		System.out.println(solution(arr));
	}
	public static int solution(int[] A){
		if(A.length<2){
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int cur = A[0];
		for(int i=1;i<A.length;i++){
			cur = Math.min(cur, A[i]);
			max = Math.max((A[i] - cur),max);
		}
		return max;
	}

}
