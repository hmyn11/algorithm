package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A7576 {
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
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < M; j++) {
				ARR[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//bfs(0, 0);
		
		System.out.println(ARR[N - 1][M - 1]);
	}
}