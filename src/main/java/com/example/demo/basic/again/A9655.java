package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9655 {
	static int N;
	static int[] DP;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		DP = new int[N+1];
		DP[0] = N;
		
		for (int i = 1; i <= N; i++) {
			if (DP[i-1] == 0) {
				if ((i-1) % 2 == 1) System.out.println("SK");
				if ((i-1) % 2 == 0) System.out.println("CY");
				
				break;
			}
			
			if (DP[i-1] >= 3) {
				DP[i] = DP[i-1] - 3;
			} else {
				DP[i] = DP[i-1] - 1;
			}
		}
	}
}