package lesson7;

import java.util.Stack;

public class Fish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {5,4,3,2,1};
		int B[] = {1,0,0,0,0};
		System.out.println(solution(A,B));

	}
	
	public static int solution(int[] A,int[] B){
			int N = A.length;
			int live = N;
			int downfishValue=0;
			int upfishValue=0;
			Stack<Integer> downFish = new Stack<>();
			/*****
			 * 
			 * 핵심은 내려가는 물고기만 생각 하고 
			 * 올라오는 물고기를 만났을 때 서로 잡아 먹는 것
			 */
			for (int i = 0; i < N; i++) {
				if (B[i] == 0) {			
					if (!downFish.empty()) {
						while (!downFish.empty()) {
							downfishValue = downFish.peek();
							upfishValue = A[i];
							if (downfishValue > upfishValue) {
								live--;
								break;
							} else { // 올라 오는 물고기가 값이 더 크면 내려 오는 물고기 하나 잡아 먹고 계속 올라감
								live--;
								downFish.pop();
							}
						}
					}
				}else {			
					downFish.push(A[i]);
				}
			}
			return live;
	}

}
