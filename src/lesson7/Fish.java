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
			 * �ٽ��� �������� ����⸸ ���� �ϰ� 
			 * �ö���� ����⸦ ������ �� ���� ��� �Դ� ��
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
							} else { // �ö� ���� ����Ⱑ ���� �� ũ�� ���� ���� ����� �ϳ� ��� �԰� ��� �ö�
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
