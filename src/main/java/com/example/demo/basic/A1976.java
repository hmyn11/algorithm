package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1976 {
	static int N, M;
	static int[] parent;
	static boolean isComplete = true;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        parent = new int[M + 1];
        for (int i = 1; i <= M; i++) {
        	parent[i] = i;
		}
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 1; j <= N; j++) {
				int x = Integer.parseInt(st.nextToken());
				
				if (x == 1) {
					union(i, j);
				}
			}
		}
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= M; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if (find(a) != find(parent[1])) {
				isComplete = false;
				break;
			}
		}
		
		System.out.println(isComplete? "YES" : "NO");
	}
	
	static void union(int i, int j) {
		// 1,2
		// 2,1 2,3
		// 3,2
		// 1 2 3
		// 1 1 1
		System.out.println(i);
		System.out.println(j);
		System.out.println("----");
		int a = find(i);
		int b = find(j);
		
		if (a != b) {
			parent[j] = i;
		}
	}
	
	static int find(int v) {
		if (parent[v] == v) {
			return v;
		} else {
			return parent[v] = find(parent[v]);
		}
	}
}