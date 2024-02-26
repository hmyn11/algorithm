package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9095 {
	static int N;
	static int[] ARR = new int[N];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			ARR[i] = Integer.parseInt(br.readLine());
		}
		
		// 1 > 1
		// 2 > 1+1/2
		// 3 > 1+1+1/1+2/2+1/3
		// 4 > 1+1+1+1/1+1+2/1+2+1/2+1+1/2+2/1+3/3+1
		// 5 > 1+1+1+1+1/1+1+1+2/1+1+2+1/1+2+1+1/2+1+1+1/1+2+2/2+1+2/2+2+1/1+1+3/1+3+1/3+1+1/3+2/2+3
		// 6 > 1/5/6/1/4/6/1
		System.out.println();
	}
}