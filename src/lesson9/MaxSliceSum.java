package lesson9;

import java.util.ArrayList;
import java.util.List;

public class MaxSliceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,-6,4,0};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] A){
		double meh = -2147483648;
        double msf = -2147483648;
        for (int i : A) {
            meh = Math.max(i, meh + i);
            msf = Math.max(msf, meh);
            System.out.println(meh + " " + msf);
        }
        return (int) msf;
	}

}
