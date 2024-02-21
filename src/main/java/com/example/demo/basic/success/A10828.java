package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A10828 {
	static Stack<Integer> stack;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		stack = new Stack<Integer>();
		
		for (int i = 0; i < N; i++) {
			String order = br.readLine();
			String[] orders =order.split(" ");
			
			if (orders.length == 1) {
				doStack(orders[0]);
			} else {
				doStack(orders[0], Integer.parseInt(orders[1]));
			}
		}
		
	}

	private static void doStack(String a) {
		switch (a) {
			case "top" -> {
				if (stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
			}
						
			case "size" -> System.out.println(stack.size());
			
			case "empty" -> System.out.println(stack.empty() ? "1" : "0");
			
			case "pop" -> {
				if (stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
				
			}
		}
	}	
	
	private static void doStack(String a, int b) {
		switch (a) {
			case "push" -> stack.push(b);
		}
	}
}