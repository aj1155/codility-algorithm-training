package lesson6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1,1,2,3,1,2};
		System.out.println(solution(a));
	}
	
	public static int solution(int[] A){
		Set<Integer> set = new TreeSet<Integer>();
		for(int num : A){
			set.add(num);
		}
		return set.size();
	}

}
