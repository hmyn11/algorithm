package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A31434 {
	static int N, K, C = 0, S = 1;
	static int[] c;
	static int[] s;
	static int[] DP;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		c = new int[N+1];
		s = new int[N+1];
		DP = new int[K+1];
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			c[i] = A;
			s[i] = B;
		}
		
		// 1초 > 스피드 쿠폰 선택
		// 2초 > 스피드 쿠폰 선택 / C-c(1),S+s(1) / C-c(2),S+s(2) / C-c(3),S+s(3) 
		// 3초 > 스피드 쿠폰 선택 / C-c(1),S+s(1) / C-c(2),S+s(2) / C-c(3),S+s(3) 
		// 4초 > 스피드 쿠폰 선택 / C-c(1),S+s(1) / C-c(2),S+s(2) / C-c(3),S+s(3) 
		
		DP[1] = 1;
		C = 1;
		
		for (int i = 2; i <= K; i++) {
			for (int j = 0; j <= N; j++) {
				if (j == 0) {
					C += S;
					DP[i] = C;
				}
				
				DP[i] = Math.max(DP[i], DP[i-1] - c[j]);
				C = 0;
				S = 0;
			}
		}
		
		System.out.println(DP[K-1]);
	}
}