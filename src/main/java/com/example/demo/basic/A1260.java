package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1260 {
	static int n, m, v;
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new  StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for (int i = 0; i <= n; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 1; i <= m; i++) {
			st = new  StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph[x].add(y);
			graph[y].add(x);
		}
		
		for (int i = 1; i < n+1; i++) {
			Collections.sort(graph[i]);
		}
		
		br.close();
		
		dfs(v);
		System.out.println();
		
		Arrays.fill(visited, false);
		
		bfs(v);
		
		System.out.println();
	}
	
	static void dfs(int value) {
		// 1 -> 2 3  2
		// 2 -> 1 5  3
		// 3 -> 1 4  1
		// 4 -> 3 5  5
		// 5 -> 2 4  4
		// 3 1 2 5 4
		
		visited[value] = true;
		System.out.print(value + " ");
		
		for (int i : graph[value]) {
			if (!visited[i]) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int value) {
		// 1 -> 2 3  2
		// 2 -> 1 5  3
		// 3 -> 1 4  1
		// 4 -> 3 5  5
		// 5 -> 2 4  4
		// 3 1 4 2 5
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(value);
		visited[value] = true;
		System.out.print(value + " ");
		
		while (!q.isEmpty()) {
			int node = q.poll();
			
			for (int i : graph[node]) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
					System.out.print(i + " ");
				}
			}
		}
	}
}