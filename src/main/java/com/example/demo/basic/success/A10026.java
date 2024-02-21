package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10026 {
	static int N;
	static String[][] graph;
	static String[][] graph2;
	static boolean[][] isVisit;
	static boolean[][] isVisit2;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int COUNT = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		graph = new String[N][N];
		graph2 = new String[N][N];
		isVisit = new boolean[N][N];
		isVisit2 = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			
			for (int j = 0; j < N; j++) {
				graph[i][j] = String.valueOf(s.charAt(j));
				
				if (String.valueOf(s.charAt(j)).equals("B")) {
					graph2[i][j] = "B";
				} else {
					graph2[i][j] = "R";
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!isVisit[i][j]) {
					COUNT++;
					dfsNormal(i, j);
				}
			}
		}
		
		sb.append(COUNT).append(" ");
		
		COUNT = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!isVisit2[i][j]) {
					COUNT++;
					dfsUnNormal(i, j);
				}
			}
		}
		
		sb.append(COUNT);
		
		System.out.println(sb);
	}
	
	static void dfsNormal(int i, int j) {
		String color = graph[i][j];
		isVisit[i][j] = true;
		
		for (int k = 0; k < 4; k++) {
			int x = i + dx[k];
			int y = j + dy[k];
			
			if (x >= 0 && y >= 0 && x < N && y < N) {
				if (!isVisit[x][y] && graph[x][y].equals(color)) {
					dfsNormal(x, y);
				}
			}
		}
	}
	
	static void dfsUnNormal(int i, int j) {
		String color = graph2[i][j].equals("B") ? "B" : "R";
		isVisit2[i][j] = true;
		
		for (int k = 0; k < 4; k++) {
			int x = i + dx[k];
			int y = j + dy[k];
			
			if (x >= 0 && y >= 0 && x < N && y < N) {
				if (!isVisit2[x][y] && graph2[x][y].equals(color)) {
					dfsUnNormal(x, y);
				}
			}
		}
	}
}