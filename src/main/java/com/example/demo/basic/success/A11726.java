package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11726 {
	static int N;
	static int[] ARR;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		ARR = new int[N+1];
		ARR[0] = 0;
		ARR[1] = 1;
		if (N >= 2) ARR[2] = 2;
		
		// i = i-1 + i-2
		for (int i = 3; i <= N; i++) {
			long a = ARR[i-1] + ARR[i-2]; 
			ARR[i] = (int) (a % 10007); 
		}
		
		System.out.println(ARR[N]);
	}
}