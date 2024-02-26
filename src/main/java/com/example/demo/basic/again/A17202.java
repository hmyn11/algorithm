package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A17202 {
	static String A, B, C;
	static String[] ARR;
	static int[] DP;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		A = br.readLine();
		B = br.readLine();
		C = "";
		
		int n = 16;
		ARR = new String[n];
		
		for (int i = 0; i < n/2; i++) {
			C += (A.charAt(i) - '0') + (B.charAt(i) -'0');
		}
		
		for (int i = 0; i < n; i++) {
			ARR[i] = String.valueOf(C.charAt(i) - '0');
		}
		
		System.out.println();
	}
}