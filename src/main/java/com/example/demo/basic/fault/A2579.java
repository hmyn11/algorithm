package com.example.demo.basic.fault;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2579 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			arr[i] = x;
		}
		
		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
		
		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
		}
		
		System.out.println(dp[n]);
	}
}
