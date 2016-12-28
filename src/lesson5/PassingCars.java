package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {0,1,0,1,1,0,1};
		System.out.println(solution(test));

	}
	
	public static int solution(int[] A){
		long count=0;
		int add=0;
		for(int i : A){
			if(i==1){
				count +=add;
			}
			if(i==0){
				add++;
			}
		}
		
		if( count > 1000000000){
			return -1;
		}
		
		return (int)count;
		
		
		
	}

}
