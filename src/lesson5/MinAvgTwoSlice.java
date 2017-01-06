package lesson5;

public class MinAvgTwoSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {4,2,2,5,1,5,8};
		System.out.println(solution(A));

	}
	public static int solution(int A[]){
		final int N = A.length;
		int minIndex = 0;
	    double minAvg = Double.MAX_VALUE;

	      for ( int i = 0; i < N - 1; i++ ) {
	        double average = ( A[ i ] + A[ i + 1 ] ) / 2.0;

	        if ( i < N - 2 ) {
	          double threeSliceAvg = ( A[ i ] + A[ i + 1 ] + A[ i + 2 ] ) / 3.0;
	          average = Math.min( average, threeSliceAvg );
	        }

	        if ( average < minAvg ) {
	          minAvg = average;
	          minIndex = i;
	        }
	      }

	      return minIndex;

	}

}
