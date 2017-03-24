package lesson10;

public class MinPerimeterRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(1));
	}
	
	public static int solution(int N){
		int min = Integer.MAX_VALUE;
		int quo;
		int num=1;
		while(num*num<=N){
			if(N%num == 0){
				quo = N/num;
				min = Math.min((quo+num)*2, min);
			}
			num++;
		}
		return min;
	}
	
}
