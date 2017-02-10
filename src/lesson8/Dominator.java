package lesson8;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,1,1};
		System.out.println(solution(arr,arr.length));
	}
	
	public static int solution(int[] A,int N){
		if(A.length==1){
			return 0;
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int value=0;
		int index=0;
		for(int i=0;i<A.length;i++){
			if(!map.containsKey(A[i])){
				map.put(A[i], 1);
			}else{
				value = map.get(A[i])+1;
				map.put(A[i],value);
				if(value>A.length/2){
					index = i;
				}
			}
		}
		if(index>0){
			return index;
		}
		return -1;
	}

}
