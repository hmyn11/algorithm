package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A9375 {
	static int N, M;
	static Map<String, Integer> LIST = new HashMap<>();
	static int CNT = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			M = Integer.parseInt(br.readLine());
			LIST = new HashMap<>();
			
			for (int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				String w = st.nextToken();
				String t = st.nextToken();
				
				LIST.put(t, LIST.getOrDefault(t, 0) + 1);
			}
			
			CNT = 1;
			for (int a : LIST.values()) {
				CNT *= (a + 1) ;
			}
			
			System.out.println(CNT - 1);
		}	
	}
}