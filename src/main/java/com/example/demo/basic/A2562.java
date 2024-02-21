package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2562 {
	static int ARR[];
	static int MAX, CNT = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ARR = new int[9];
		
		for (int i = 0; i < 9; i++) {
			ARR[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < 9; i++) {
			if (ARR[i] > MAX) {
				MAX = ARR[i];
				CNT = i + 1;
			}
			
		}
		
		System.out.println(MAX);
		System.out.println(CNT);
	}
}