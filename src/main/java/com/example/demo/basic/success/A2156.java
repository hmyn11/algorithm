package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A2156 {
    static int N;
    static int[] ARR, DP;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        ARR = new int[N+1];

        for (int i = 1; i <= N; i++) {
            ARR[i] = Integer.parseInt(br.readLine());
        }

        DP = new int[N+1];
        DP[0] = 0;
        DP[1] = ARR[1];
        
        if (N > 1) {
        	DP[2] = ARR[1] + ARR[2];
        }

        for (int i = 3; i <= N; i++) {
            DP[i] = Math.max(DP[i-3] + ARR[i-1] + ARR[i], DP[i-2] + ARR[i]);
            DP[i] = Math.max(DP[i], DP[i-1]);
        }

        System.out.println(DP[N]);
    }
}