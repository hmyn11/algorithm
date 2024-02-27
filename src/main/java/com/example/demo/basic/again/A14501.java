package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14501 {
	static int N;
	static int[] T, P;
	static int[] DP;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		T = new int[N + 1];
		P = new int[N + 1];
		DP = new int[N + 2];
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i <= N; i++) {
			if (i + T[i] <= N) {
				DP[i + T[i]] = Math.max(DP[i + T[i]], DP[i] + P[i]);
			}

			DP[i+1] = Math.max(DP[i], DP[i+1]);
		}
		
		
		System.out.println(DP[N]);
	}
}