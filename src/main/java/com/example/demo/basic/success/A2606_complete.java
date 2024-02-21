package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A2606_complete {
	static int n, m;
	static ArrayList<Integer>[] graph;
	static boolean[] isVisit;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		graph = new ArrayList[n+1];
		isVisit = new boolean[n+1];
		
		for (int i = 0; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		StringTokenizer st;
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph[x].add(y);
			graph[y].add(x);
		}
		
		dfs(1);	
		System.out.println(cnt);
	}
	
	static void dfs(int value) {
		isVisit[value] = true;
		
		//7
		//6
		//1 2
		//2 3
		//1 5
		//5 2
		//5 6
		//4 7
		
		// 1 -> 2 5    1
		// 2 -> 1 3 5  2 
		// 3 -> 2      3
		// 4 -> 7
		// 5 -> 1 2 6  4
		// 6 -> 5      5
				// 7 -> 4
		for (int i : graph[value]) {
			if (!isVisit[i]) {
				cnt++;
				dfs(i);
				
			}
		}
	}
}