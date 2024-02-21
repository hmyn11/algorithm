package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A1874 {
	static int N;
	static Stack<Integer> stack;
	static boolean isErr = false;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		stack = new Stack<>();
		
		int no = 1;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			int a = Integer.parseInt(br.readLine());
			
			while (no <= a) {
				stack.push(no);
				sb.append("+").append("\n");
				no++;
			}
			
			if (stack.peek() == a) {
				stack.pop();
				sb.append("-").append("\n");
			} else {
				isErr = true;
			}
		}
		
		if (isErr) {
			System.out.println("NO");
		} else {
			System.out.println(sb);
		}
	}
}