package com.example.demo.basic.fault;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2178 {
	static int N, M;
	static int[][] ARR;
	static boolean[][] isVisit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		ARR = new int[N][M];
		isVisit = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split("");
			
			for (int j = 0; j < M; j++) {
				ARR[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		bfs(0, 0);
		
		System.out.println(ARR[N - 1][M - 1]);
	}
	
	static void bfs(int x, int y) {
		int[] dr = {-1, 1, 0 , 0};
		int[] dc = {0, 0, 1 , -1};
		
		Queue<Integer> queX = new LinkedList<>();
		Queue<Integer> queY = new LinkedList<>();
		
		queX.add(0);
		queY.add(0);
		isVisit[0][0] = true;
		
		while (!queX.isEmpty()) {
			int i = queX.poll();
			int j = queY.poll();
			
			for (int k = 0; k < 4; k++) {
				int nr = i + dr[k];
				int nc = j + dc[k];
				
				if (nr >= 0 && nc >= 0 && nr < N && nc < M) { // 마지막 좌표일 때도 조건 넣기
					if (!isVisit[nr][nc] && ARR[nr][nc] == 1 ) {
						isVisit[nr][nc] = true;
						ARR[nr][nc] = ARR[i][j] + 1;
						
						queX.add(nr);
						queY.add(nc);
					}
				}
			}
		}
	}
}