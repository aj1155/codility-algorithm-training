package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1260 {
	
	static int[][] graph;
    static boolean[] visited;
    static int ver;
	static int edge;
	static int start;
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        ver = sc.nextInt();
        edge = sc.nextInt();
        start = sc.nextInt();
        graph = new int[ver+1][ver+1];
        visited = new boolean[ver+1];
        int a,b;
        for(int i=0;i<edge;i++){
        	a = sc.nextInt();
        	b = sc.nextInt();
        	graph[a][b] = graph[b][a] = 1;
        }
        dfs(start);
        System.out.println(builder.toString());
        Arrays.fill(visited, false);
        builder.setLength(0);
        bfs(start);
        System.out.println(builder.toString());
	}
	
	public static void dfs(int index){
		if(visited[index]) return;
		visited[index] = true;
		builder.append(index).append(" ");
		for(int j=1;j<=ver;j++){
			if(graph[index][j] == 1 && visited[j] == false){
				dfs(j);
			}
		}
	}
	
	public static void bfs(int index){
		Queue<Integer> queue = new LinkedList<>();
		visited[index] = true;
		int vertex;
		int j=1;
		builder.append(index).append(" ");
		queue.add(index);
		while(!queue.isEmpty()){
			vertex = queue.poll();
			while(j<graph.length){
				if(graph[vertex][j]==1 && visited[j]==false){
					visited[j] = true;
					builder.append(j).append(" ");
					queue.add(j);
				}
				j++;
			}
			j=0;
		}
	}

}
