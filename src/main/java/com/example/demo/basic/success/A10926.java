package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10926 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(n).append("??!");
		
		System.out.println(sb);
	}
}