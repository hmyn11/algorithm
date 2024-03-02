package com.example.demo.basic.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class A1043 {
	static int N, M;
	static ArrayList<Integer> PERSONLIST = new ArrayList<>();
	static ArrayList<ArrayList<Integer>> PARTY_LIST = new ArrayList<>();
	static int[] PERSON;
	static int[] KNOW_PERSON;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 사람의 수
		M = Integer.parseInt(st.nextToken()); // 파티의 수
		
		
		st = new StringTokenizer(br.readLine()); // 진실을 아는 사람
		int cnt = Integer.parseInt(st.nextToken());
		KNOW_PERSON = new int[cnt];
		PERSON = new int[M];
		
		for (int i = 0; i < cnt; i++) {
			KNOW_PERSON[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			PERSON[i] = i;
		}
		
		for (int i = 0; i < M; i++) {
			PERSONLIST = new ArrayList<>();
			st = new StringTokenizer(br.readLine()); // 파티 별로 오는 사람수 + 명단
			int p_no = Integer.parseInt(st.nextToken()); // 사람 수
			
			for (int j = 0; j < p_no; j++) {
				PERSONLIST.add(Integer.parseInt(st.nextToken()));
			}
			
			PARTY_LIST.add(PERSONLIST);
		}
		
		for (int i = 0; i < PARTY_LIST.size(); i++) {
			for (int j = 0; j < PARTY_LIST.get(i).size() - 1; j++) {
				union(PARTY_LIST.get(i).get(j), PARTY_LIST.get(i).get(j+1));
			}
		}
		
		System.out.println();
	}
	
	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if (a != b) {
			PERSON[b] = a;
		}
	}
	
	static int find(int value) {
		if (PERSON[value] == value) {
			return value;
		} else {
			return find(PERSON[value]);
		}
	}
}