package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1012 {
	static int T, N, M, K;
	static int[][] graph;
	static boolean[][] isVisit;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int CNT = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;

		for (int a = 0; a < T; a++) { // 케이스
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			graph = new int[N][M];
			isVisit = new boolean[N][M];
			
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				graph[x][y] = 1;
			}
			
			CNT = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (graph[i][j] == 1 && isVisit[i][j] == false) {
						CNT++;
						dfs(i, j);
					}
				}
			}
			
			System.out.println(CNT);
		}
	}
	
	static void dfs(int i, int j) {
		isVisit[i][j] = true;
		
		for (int j2 = 0; j2 < 4; j2++) {
			int x = i + dx[j2];
			int y = j + dy[j2];
			
			if (x >= 0 && y >=0 && x < N && y < M) {
				if (!isVisit[x][y] && graph[x][y] == 1) {
					dfs(x, y);
				}
			}
		}
	}
}