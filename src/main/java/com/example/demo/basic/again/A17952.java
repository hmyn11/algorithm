package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A17952 {
	static int N, M;
	static int SUM = 0;
	static Stack<Task> STACK = new Stack<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			
			if (a == 1) {
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				Task t = new Task(b, c - 1);
				STACK.add(t);
			} else {
				int s = STACK.peek().score;
				int t = STACK.peek().time - 1;
				STACK.pop();
				STACK.add(new Task(s, t));
			}
			
			if (STACK.peek().time == 0) {
				SUM += STACK.peek().score;
				STACK.pop();
			}
		}
		
		System.out.println(SUM);
	}
	
	static class Task {
		int score, time;

		public Task(int score, int time) {
			this.score = score;
			this.time = time;
		}

		public void sendTime() {
			this.time--;
		}
	}
}