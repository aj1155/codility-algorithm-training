package nexon;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GetMaxValue {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addAll(Arrays.asList(1,3,5,13,21));
		System.out.println(getMaxValue(list));
	}
	
	public static int getMaxValue(LinkedList<Integer> list){
		
		String stringSet = list.toString().replaceAll("[^0-9]*", "");
		int maxCount=0;
		char maxInt=0;
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] charList = stringSet.toCharArray();
		for(char c : charList){
			if(hm.get(c)==null){
				hm.put(c, 1);
			}else{
				hm.put(c, hm.get(c)+1);
			}
			if(maxCount<hm.get(c)){
				maxInt = c;
			}			
		}
	
		return (int)maxInt-48;
	}

}
