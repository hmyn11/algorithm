package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class A20920 {
	static int N, M;
	static Map<String, Integer> WORDS = new HashMap<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			
			if (word.length() >= M) {
				WORDS.put(word, WORDS.getOrDefault(word, 0) + 1);
			}
		}
		
		List<String> wordList = new ArrayList<>(WORDS.keySet());
		
		// value 값이 큰게 앞으로 온다.
		// key의 글길이가 길 수록 앞으로 온다.
		// 알파벳 사전 순으로 배치한다.
		wordList.sort((s1, s2) -> {
			int t1 = WORDS.get(s1); // 빈도수
			int t2 = WORDS.get(s2); // 빈도수
			
			if (t1 == t2) { // 빈도수가 같으면 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				
				return s2.length() - s1.length();
			}
			
			return t2 - t1;
		});
		
		wordList.forEach(s -> System.out.println(s));
	}
}