package com.example.demo.basic.fault;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1929 {
    static boolean[] isPrime;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 3 16
        // 3 5 7 11 13

        isPrime = new boolean[n+1];
        
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
        	if (!isPrime[i]) { // 배수
        		continue; // 4 6 8 10
        	}
        	
        	// 소수
            isPrime[i] = true;

            for (int j = i + i; j <= n; j = j + i) {
                isPrime[j] = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}