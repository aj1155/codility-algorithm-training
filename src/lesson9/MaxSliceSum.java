package lesson9;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Manki Kim
 * Kadane 알고리즘을 이용하는 문제
 */

public class MaxSliceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,-4,3,1,5,6,-35,12,21,-1};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] A){
		double meh = -2147483648;
        double msf = -2147483648;
        for (int i : A) {
            meh = Math.max(i, meh + i);
            msf = Math.max(msf, meh);
        }
        return (int) msf;
	}

}
