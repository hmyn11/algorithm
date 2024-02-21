package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		
		n = n.toUpperCase();
		
		int[] alphabet = new int[26];
		int[] arr = new int[n.length()];
		
		for (int i = 0; i < n.length(); i++) {
			arr[n.charAt(i) - 65] += 1;
		}
		
		
		System.out.println(n.charAt(0) - 65);
	}
}