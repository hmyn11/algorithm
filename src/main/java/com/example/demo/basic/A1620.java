package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> pocketmon1 = new HashMap<Integer, String>();
		HashMap<String, Integer> pocketmon2 = new HashMap<String, Integer>();
		
		for (int i = 1; i <= N; i++) {
			String a = br.readLine();
			pocketmon1.put(i, a);
			pocketmon2.put(a, i);
		}
		
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			
			if (s.charAt(0) >= 65 && s.charAt(0) <= 122) {
				System.out.println(pocketmon2.get(s));
			} else {
				System.out.println(pocketmon1.get(Integer.parseInt(s)));
			}
		}
	}
}