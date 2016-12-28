package lesson5;

public class CountDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(0,1,11));
	}
	public static int solution(int A,int B,int K){
		int result=0;
		result = Math.max(A, B)/K;
		result -=Math.min(A, B)/K;
		if(A%K==0||B%K==0){
			result++;
		}
		
		return result;
	}

}
