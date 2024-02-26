package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11052 {
	static int N, M;
	static int[] ARR;
	static int[] DP;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		ARR = new int[N+1];
		DP = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			ARR[i] = Integer.parseInt(st.nextToken());
			
			for (int j = 1; j <= i; j++) {
				DP[i] = Math.max(DP[i], DP[i-j] + ARR[j]);
			}
		}
		
		//4
		//1 5 6 7
		//dp[1] = 0+4, dp[2] = 2+2, dp[3] = 3+1, dp[4] = 4+0
		//dp[1] = 0+1, dp[2] = 1+1/0+2, dp[3] = 0+3/1+2/2+1/3+0, dp[4] = 0+4/1+3/2+3/3+1
		
		//5
		//10 9 8 7 6
		//dp[1] = 0+1, dp[2] = 0+2/1+1, dp[3] = 0+3/1+2/2+1/3+0, dp[4] = 0+4/1+3/2+2/3+1/4+0, dp[5] = 0+5/1+4/2+3/3+2/4+1/5+0
		
//		for (int i = 1; i <= N; i++) {
//			if (N % i == 0) {
//				int x = N / i;
//				DP[i] = Math.max(x * ARR[i], ARR[i] + ARR[N-i]);
//			} else {
//				DP[i] = ARR[i] + ARR[N-i];
//			}
//		}
		
		System.out.println(DP[N]);
	}
}