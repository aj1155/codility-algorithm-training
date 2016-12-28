package lesson3;

import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 6, 2, 4, 1};
		System.out.println(search(a));
	}
	public static int search(int[] A){
		int[] p = new int[A.length-1];
		int all=0;
		int temp=0;
		for(int i=0;i<A.length;i++){
			all +=A[i];
		}
		
		for(int i=0;i<A.length-1;i++){
			if(i==0){
				p[i] = Math.abs(A[i] - (all-A[i]));
				temp +=A[i];
			}
			else{
				temp +=A[i];
				p[i] = Math.abs(temp-(all-temp));
			}
			
		}
		int min = p[0];
	
		for(int i=1;i<p.length;i++){
			
			if(p[i]<min){
				min = p[i];
			}
		}
		System.out.println(Arrays.toString(p));
		return min;
	}

}
