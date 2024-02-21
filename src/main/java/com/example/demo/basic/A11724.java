package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11724 {
	static int n, m;
	static int[][] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				graph[i][j] = 0;
			}
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph[x][y] = 1;
			graph[y][x] = 1;
		}
		
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dps(i);
				cnt++;
			}
		}
		
		
		br.close();
		
		System.out.println(cnt);
	}
	
	public static void dps(int val) {
		visited[val] = true;
		
		// 1 -> 2 5    1
		// 2 -> 1 5    2
		// 3 -> 4
		// 4 -> 3 6
		// 5 -> 1 2    3
		// 6 -> 4
		
		for (int i = 1; i <= n; i++) {
			if (graph[val][i] == 1 && !visited[i]) {
				dps(i);
			}
		}
	}
}