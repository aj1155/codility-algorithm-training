package lesson17;

public class NumberSolitaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,-4,-5,-2,-7,-2};
		System.out.println(solution(A));
	}
	
	
	public static int solution(int[] A){
		int[] temp = new int[A.length];
		temp[0] = A[0];
		for(int i=1; i<A.length;i++){
			if(temp[i-1]+A[i]>temp[i-1]){
				temp[i]+=temp[i-1]+A[i];
			}else{
				temp[i] = temp[i-1];
			}
		}
		
		if(A[A.length-1]<0){
			temp[A.length-1] +=A[A.length-1];
		}
		
		return temp[A.length-1];
	}

}
