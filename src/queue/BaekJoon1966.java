package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Document implements Comparable{
	int key;
	int priority;
	
	public Document(int key,int priority){
		this.key = key;
		this.priority = priority;
	}
	@Override
	public String toString(){
		return String.format("key: %d,priority : %d", key,priority);
	}

	@Override
	public int compareTo(Object o) {
		Document d = (Document)o;
		return d.priority - this.priority;
	}

}

public class BaekJoon1966 {
	
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N,M;
		int test;
		test = input.nextInt();
		for(int i=0;i<test;i++){
			N = input.nextInt();
			M = input.nextInt();
			solution(N,M,input);
		}
		System.out.println(builder.toString());

	}
	
	public static void solution(int N,int M,Scanner input){
		PriorityQueue<Document> pq = new PriorityQueue<>();
		Deque<Document> dq = new LinkedList<>();
		Document dc;
		int priority;
		int max = Integer.MIN_VALUE;
		int find=-1;
		int count=0;
		int key;
		for(int i=0;i<N;i++){
			priority = input.nextInt();
			key = i+100;
			dc = new Document(key,priority);
			pq.add(dc);
			dq.add(dc);
			if(i==M){
				find = key;
			}
		}
		while(!dq.isEmpty()){
			if(pq.peek().priority == dq.peek().priority){
				count++;
				pq.poll();
				if(dq.poll().key==find){
					builder.append(count).append("\n");
					return;
				}
			}else{
				dc = dq.poll();
				dq.addLast(dc);
			}
		}
					
	}

	

}
