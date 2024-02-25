package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9461 {
	static int N;
	static long[] ARR;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			
			ARR = new long[a+1];
			ARR[0] = 0;
			ARR[1] = 1;
			
			if (a >= 2) {
				ARR[2] = 1;
			}
			
			//1, 1, 1, 2, 2, 3, 4, 5, 7, 9
			// i = i-3 + i-2
			for (int j = 3; j <= a; j++) {
				ARR[j] = ARR[j-2] + ARR[j-3];
			}
			
			System.out.println(ARR[a]);
		}
	}
}