package kadane;

/***
 * @author Manki Kim
 * 
 * problem : 
 * n���� ������ �̷���� ������ ������ �־�����. �츮�� �� �� ���ӵ� �� ���� ���ڸ� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���ڴ� �� �� �̻� �����ؾ� �Ѵ�.
 * ���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ������ 12+21�� 33�� ������ �ȴ�.
 * solution :
 * ���������� �����ϸ鼭 Element���� ������ �� �� �� ū ���� ���ϸ鼭
 * �κ� �� �� �ִ븦 ����ϴ� ����
 * kadane �˰����� �̿��ϸ� ���� Ǯ���� ����
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
