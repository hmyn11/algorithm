package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A31423 {
	static int N;
	static int LAST = 0;
	static HashMap<Integer, String> map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new HashMap<Integer, String>();
		
		for (int i = 1; i <= N; i++) {
			map.put(i, br.readLine());
		}
		
		StringTokenizer st;
		StringBuilder sb;
		
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb = new StringBuilder();
			
			map.put(a, String.valueOf(sb.append(map.get(a)).append(map.get(b))));
			
			LAST = a;
		}
		
		System.out.println(map.get(LAST));
	}
}