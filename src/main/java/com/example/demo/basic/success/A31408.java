package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A31408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[100001];
		
		for (int i = 1; i <= N; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[a]++;
		}
		
		int MAX = -1;
		for (int i = 1; i <= 100000; i++) {
			if (arr[i] > MAX) {
				MAX = arr[i];
			}
		}
		
		if (MAX <= Math.round((double) N / 2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}