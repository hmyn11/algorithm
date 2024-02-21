package com.example.demo.basic.fault;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[m];
		
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr1);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr2.length; i++) {
			if (Arrays.binarySearch(arr1, arr2[i]) < 0) {
				sb.append(0).append("\n");
			} else {
				sb.append(1).append("\n");
			}
		}
		
		br.close();
		
		System.out.println(sb);
	}
}