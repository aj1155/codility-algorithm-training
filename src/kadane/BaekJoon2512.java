package kadane;

import java.util.Scanner;

public class BaekJoon2512 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		N = input.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = input.nextInt();
		}
		int budget = input.nextInt();
		System.out.println(solution(arr,budget));
	}
	
	public static int solution(int[] A,int budget){
		int maximum=0;
		int len=0;
		int divide = budget;
		for(int i=0;i<A.length;i++){
			if(budget/A[i]==A.length && A[i]>maximum){
				maximum = A[i];
				divide -= A[i];
				continue;
			}
			else if(budget/A[i]==A.length && A[i]<maximum){
				divide -=A[i];
			}
			else if(budget/A[i]<A.length && A[i]>maximum){
				len++;
			}
		}
		int result = divide - (maximum*len);
		result /= len;
		return maximum + result ;
	}
	
	

}
