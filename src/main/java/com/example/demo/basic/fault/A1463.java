package com.example.demo.basic.fault;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1463 {
	static int RESULT = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int[] arr = new int[X + 1];

		arr[1] = 0;
		for (int i = 2; i <= X; i++) {
			arr[i] = arr[i - 1] + 1;
			
			if (i % 2 == 0 && arr[i] > arr[i / 2] + 1) {
				arr[i] = arr[i / 2] + 1;
			}
			
			if (i % 3 == 0 && arr[i] > arr[i / 3] + 1) {
				arr[i] = arr[i / 3] + 1;
			}
		}
		
		System.out.println(arr[X]);
	}
}