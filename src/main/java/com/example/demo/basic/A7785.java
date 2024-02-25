package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class A7785 {
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		HashMap<String, String> map = new HashMap();
		
		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			
			if ("enter".equals(arr[1])) {
				map.put(arr[0], arr[1]);
			} else if ("leave".equals(arr[1])) {
				map.remove(arr[0]);
			}
		}
		
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		
		list.sort(Comparator.reverseOrder());
		list.forEach(s -> System.out.println(s));
	}
}