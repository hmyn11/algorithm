package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A1463 {
	static int N;
	static int[] DP;
	
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        DP = new int[N+1];
        DP[0] = 0;
        DP[1] = 0;

        for (int i = 2; i <= N; i++) {
            DP[i] = 1000000;
        }

        for (int i = 2; i <= N; i++) {
            if (i % 3 == 0) {
                DP[i] = DP[i/3] + 1;
            }

            if (i % 2 == 0) {
                DP[i] = Math.min(DP[i], DP[i/2] + 1);
            }

            DP[i] = Math.min(DP[i], DP[i-1] + 1);
        }

        System.out.println(DP[N]);
    }
}