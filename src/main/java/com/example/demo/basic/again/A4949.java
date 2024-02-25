package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A4949 {
	static int N, M;
	static Stack<String> STACK;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		while (!".".equals(s)) {
			s = br.readLine();
			STACK = new Stack();
			
			for (int i = 0; i < s.length(); i++) {
				switch (String.valueOf(s.charAt(i))) {
					case "("  :
						STACK.push("(");
						break;
						
					case "["  :
						STACK.push("[");
						break;
						
					case ")"  :
						if (STACK.empty()) {
							STACK.push(")");
						}
						
						if (!STACK.empty() && STACK.peek().equals("(")) {
							STACK.pop();
						}
						break;
						
					case "]"  :
						if (STACK.empty()) {
							STACK.push("]");
						}
						
						if (!STACK.empty() && STACK.peek().equals("[")) {
							STACK.pop();
						}
						break;
				}
			}
			
			if (STACK.size() == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}