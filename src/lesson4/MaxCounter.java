package lesson4;

import java.util.HashMap;
import java.util.Map;

public class MaxCounter {

	public static void main(String[] args) {
		
		int[] arr = {4,4,4,5,5,3,3,5,5,2,5};
		solution(arr,4);
	}
	public static void solution(int[] A,int N){
		int[] arr = new int[N];
		int index;
		boolean b = false;
		int maxValue=0;
		int max = 0;
		for(int i=0;i<A.length;i++){
			
			if(A[i]>N){
				max = maxValue;
				
			}
			else{
				
				if(arr[A[i]-1]<=max){
					arr[A[i]-1] = max;
				}
				arr[A[i]-1]++;
				maxValue = Math.max(maxValue, arr[A[i]-1]);
			}
			
			
		}
		for(int i : arr){
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=max){
				arr[i]=max;
			}
		}
		System.out.println();
		for(int i : arr){
			System.out.print(i+" ");
		}
		
	
		
	
	}

}
