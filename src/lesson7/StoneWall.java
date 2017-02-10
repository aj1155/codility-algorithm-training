package lesson7;

import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,1,4,6,7,9,10,1};
		System.out.println(solution(arr));
	}
	public static int solution(int[] H){
		int count=0;
		int max=0;
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<H.length;i++){
			if(st.empty()){
				st.push(H[i]);
				max=H[i];
				continue;
			}
			if(H[i]==max){
				continue;
			}else if(H[i]>max){
				st.push(H[i]);
				max=H[i];
				continue;
				
			}else{
				while(!st.empty()&&st.peek()>H[i]){
					st.pop();
					count++;
				}
				if(st.empty() || st.peek() < H[i]){
					st.push(H[i]);
				}
				max = H[i];
			}
		}
		return count+st.size();
		
	}

}
