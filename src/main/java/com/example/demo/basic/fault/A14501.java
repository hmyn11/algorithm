package com.example.demo.basic.fault;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class A14501 {
	static int N;
	static ArrayList<Integer> DAY_LIST = new ArrayList();
	static ArrayList<Integer> PAY_LIST = new ArrayList();
	static ArrayList<Integer> SUM_LIST = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			DAY_LIST.add(a);
			PAY_LIST.add(b);
		}
		
		for (int i = 0; i < N; i++) {
			int d = DAY_LIST.get(i);
			SUM_LIST.add(i, 0);
			
			if (i + d < N) {
				for (int j = i; j < N; j++) {
					int dd = DAY_LIST.get(j);
					int pp = PAY_LIST.get(j);
					
					if (j + dd <= N) {
						SUM_LIST.set(i, SUM_LIST.get(i) + PAY_LIST.get(j));
						
						j += dd - 1;
					}
				}
			}
		}
		
		int max = Collections.max(SUM_LIST);
		
		System.out.println(max);
	}
}