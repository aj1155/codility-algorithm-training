package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Circle implements Comparable{
	long min;
	long max;
	
	public Circle(long max,long min){
		this.max = max;
		this.min = min;
	}
	
	@Override
	public int compareTo(Object o){
		Circle c1 = (Circle)o;
		return (int) (this.min - c1.min);
	}
	
}

public class NumberOfDisIntersections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[] = {1,0,1,0,1};
		System.out.println(solution(temp));
	}
	
	public static int solution(int[] A){
		Map<Integer,Integer> map = new HashMap<>();
		Circle[] list = new Circle[A.length];
		long max;
		long min;
		int count=0;
		for(int i=0;i<A.length;i++){
			max = i + A[i];
			min = i - A[i];
			Circle c = new Circle(max,min);
			list[i] = c;
		}
		Arrays.sort(list);
		for(int j=0;j<list.length;j++){
			for(int i=j+1;i<list.length && (list[j].max>=list[i].min);i++){
					count++;
			}
		
		}
		return count;
		
	}
	

}
