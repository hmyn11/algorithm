package com.example.demo.basic.fault;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1717 {
    static int n, m;
    static int[] parent;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (x == 0) {
                union(a, b);
            } else {
            	if (find(a) == find(b)) {
            		System.out.println("YES");
            	} else {
            		System.out.println("NO");
            	}
            }
        }
    }

    static void union(int a, int b) { // 같은 집합으로 합치기
        a = find(a);
        b = find(b);

        if (a != b) {
        	parent[b] = a;
        }
    }

    static int find(int v) { // 부모 찾기
    	if (parent[v] == v) {
    		return v;
    	} else {
    		return parent[v] = find(parent[v]);
    	}
    }
}