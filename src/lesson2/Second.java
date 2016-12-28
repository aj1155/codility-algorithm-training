package lesson2;

import java.util.HashMap;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,1,2,3,1,2,1,2};
		int n=0;
		//excluenor 쓰는코드!!
		for(int i=0;i<a.length;i++){
			n ^=a[i];
		}
		System.out.println(n);
		System.out.println(search(a));
	}
	public static int search(int[] a){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i : a){
			if(hm.containsKey(i)){
				hm.put(i, hm.get(i)+1);
			}
			else{
				hm.put(i, 1);
			}
		}
		for(int v : hm.keySet()){
			if(hm.get(v)%2==1){
				return v;
			}
		}
		return -1;
	}

}
