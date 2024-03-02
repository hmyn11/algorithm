package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class A21608 {
	static int N, M;
	static Map<Integer, List<Integer>> S_MAP = new HashMap<>();
	static List<Integer> LIKE_LIST = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			
			for (int j = 0; j < 4; j++) {
				LIKE_LIST.add(Integer.parseInt(st.nextToken()));
			}
			
			S_MAP.put(k, LIKE_LIST);
		}
		
		System.out.println();
	}
}