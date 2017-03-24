package lesson10;

public class CountFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(1));
	}
	public static int solution(int N){
		long num = 1;
		long count=0;
		while(num*num<N){
			if(N%num==0){
				count++;
			}
			num++;
		}
		count = 2*count;
		if(num*num==N){
			count++;
		}
		return (int)count;
	}

}
