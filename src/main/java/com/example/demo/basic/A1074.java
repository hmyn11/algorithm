package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1074 {
	static int N, r, c;
	static int[][] ARR;
	static int cnt = 0;
	static int MAX = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		MAX = (int) Math.pow(2, N);
		ARR = new int[MAX][MAX];
		
		setArray(0, 0);
		
		System.out.println(ARR[r][c]);
	}
	
	static void setArray(int i, int j) {
		ARR[i][j] = cnt++;
		ARR[i][j + 1] = cnt++;
		ARR[i + 1][j] = cnt++;
		ARR[i + 1][j + 1] = cnt++;
		
		if (i >= j) {
			j = j + 2;
		} else if (i < j ) {
			i = i + 2;
		}
		
		if (i < MAX && j + 2 < MAX) {
			setArray(i, j + 2);
		} else if (i + 2 < MAX && j + 2 >= MAX) {
			setArray(i + 2, 0);
		}
	}
}