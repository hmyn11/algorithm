package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1932 {
    static int N;
    static int[][] ARR, DP;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        ARR = new int[N][N];
        DP = new int[N][N];
        ARR[0][0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int j = 0;

            while (st.hasMoreTokens()) {
                ARR[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    ARR[i][j] = ARR[i-1][j] + ARR[i][j];
                } else if (i == j) {
                    ARR[i][j] = ARR[i-1][j-1] + ARR[i][j];
                } else {
                    ARR[i][j] = Math.max(ARR[i-1][j] + ARR[i][j], ARR[i-1][j-1] + ARR[i][j]);
                }
            }
        }

        int max = 0;

        for (int i = 0; i < N; i++) {
            if (ARR[N-1][i] > max) {
                max = ARR[N-1][i];
            }
        }

        System.out.println(max);
    }
}