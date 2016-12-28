package lesson2;

import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		a = change(a,3);
		System.out.println(Arrays.toString(a));
	}
	public static int[] change(int[] a,int k){
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++){
			int index = i+k;
			if(index>=a.length){
				index %=k;
			}
			b[index] = a[i];
		}
		return b;
	}

}
