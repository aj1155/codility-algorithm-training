package coupang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputs = {"a","b","c","d","e","f","g","h"};
		System.out.println(Arrays.toString(solution(inputs)));
	}
	
	public static String[] solution(String[] arr){
		
		List<String> list = new ArrayList<String>();
		int count=1;
		for(String s : arr){
			if(count==4){
				count=1;
			}
			list.add("[arr"+count+","+s+"]");
			count++;
		}
		return list.toArray(new String[0]);
	}

}
