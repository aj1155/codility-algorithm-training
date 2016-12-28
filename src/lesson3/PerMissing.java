package lesson3;

import java.util.HashMap;

public class PerMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,1,4};
		System.out.println(solution(a));
	}
	 public static int solution(int[] A) {
	     HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	   
	     for(int i=1;i<=A.length+1;i++){
	    	 hm.put(i, 1);
	     }
	     int result = 0;
	     for(int num : A){
	    	 hm.put(num, 0);
	     }
	     for(int k : hm.keySet()){
	    	 if(hm.get(k)>0){
	    		 result = k ;
	    	 }
	     }
	     
	     return result;
	 }

}
