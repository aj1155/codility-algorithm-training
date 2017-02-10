package dp;

import java.util.Arrays;

public class BaekJoon3948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] types = {1,2,3};
		solution(types,20);
	}
	
	public static void solution(int[] types,int count){
		int[] result = new int[21];
		result[1] = 1;
		result[2] = 2;
		int temp=0;
		
		for(int i=3;i<=20;i++){
			for(int j=0;j<i;j++){
				if(j==0 && j==i-1){
					temp += result[j-1]-1;
				}else{
					temp += i-1;
				}
			}
			result[i] = temp;
			temp=0;
		}
		System.out.println(Arrays.toString(result));
		
	}

}
