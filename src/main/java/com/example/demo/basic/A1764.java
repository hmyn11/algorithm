package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class A1764 {
	static int N, M;
	static Map<String, Integer> MAP = new HashMap();
	static List<String> list = new ArrayList();
	static int COUNT = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			MAP.put(br.readLine(), 1);
		}
		
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			MAP.put(name, MAP.getOrDefault(name, 0) + 1);
			
			if (MAP.get(name) == 2) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		
		System.out.println(list.size());
		list.forEach(s -> System.out.println(s));
	}
}