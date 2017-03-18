package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = input.nextInt();
            if (arr[i] > len || 1 > arr[i])
    		{
    			System.out.println("NO");
    			return;
    		}
        }
		solution(arr,arr.length);
	}
	
	public static void solution(int[] A,int len){
		int cur=0;
		int j=0;
		int pushCount=0;
		Queue<String> result = new LinkedList<>();
		cur = A[0];
		while(j<A.length){
			result.add("+");
			pushCount++;
			while(cur <= pushCount){
				result.add("-");
				j++;
				if(j==A.length){
					break;
				}
				cur = A[j];
			}				
		}
		result.stream().forEach(System.out::println);
	}

}
