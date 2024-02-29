package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1158 {
	static int N, K;
	static Queue<Integer> que = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= N; i++) {
			que.offer(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while (!que.isEmpty()) {
			if (que.size() != 1) {
				for (int i = 0; i < K - 1; i++) {
					int a = que.poll();
					que.offer(a);
				}
				
				int b = que.poll();
				sb.append(b).append(", ");
			} else {
				sb.append(que.poll());
			}
		}
		
		sb.append(">");
		System.out.println(sb);
	}
}