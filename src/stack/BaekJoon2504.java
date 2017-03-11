package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/***
 * 
 * @author Manki Kim
 * (X) = *2
 * [X] = *3
 * (X) + [X]
 *
 */

public class BaekJoon2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	     String s;
	     s = input.nextLine();
		//String s = "(()[[]])([])";
		solution(s);
	}
	
	public static void solution(String A){
		Stack<Character> st = new Stack<>();
		char[] arr = Arrays.copyOf(A.toCharArray(), A.length()+1);
		int sum = 0;
		int tmp = 1;
		for(int i=0;i<arr.length;i++){
			if(st.size()==0){
				tmp = 1;
			}
			if(arr[i]=='('){
				st.push('(');
				tmp *= 2;
				if(arr[i+1]==')'){
					sum += tmp;
				}
			}
			else if(arr[i]=='['){
				st.push('[');
				tmp *= 3;
				if(arr[i+1]==']'){
					sum += tmp;
				}
			}
			else if(arr[i]==')'){
				if(st.pop()!='('){
					System.out.println(0);
					break;
				}
				if(!st.empty()){
					tmp /= 2;
				}
			}
			else if(arr[i]==']'){
				if(st.pop()!='['){
					System.out.println(0);
					break;
				}
				if(!st.empty()){
					tmp /= 3;
				}
			}
		}
		if(!st.isEmpty()){
			System.out.println(0);
			return;
		}
		System.out.println(sum);
	}

}
