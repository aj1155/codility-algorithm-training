package kadane;

/***
 * @author Manki Kim
 * 
 * problem : 
 * n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 숫자를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 숫자는 한 개 이상 선택해야 한다.
 * 예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 여기서 정답은 12+21인 33이 정답이 된다.
 * solution :
 * 순방향으로 진행하면서 Element값과 누적한 값 중 더 큰 값을 구하면서
 * 부분 합 중 최대를 기록하는 문제
 * kadane 알고리즘을 이용하면 쉽게 풀리는 유형
 */
public class BaekJoon1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,-4,3,1,5,6,-35,12,21,-1};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] A){
		int mes = Integer.MIN_VALUE;
		int mr = Integer.MIN_VALUE;
		
		for(int i : A){
			mes = Math.max(i, mes+i);
			mr = Math.max(mr, mes);
		}
		
		return mr;
		
	}

}
