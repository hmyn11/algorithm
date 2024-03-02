package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A19941 {
	static int N, M;
	static String[] ARR;
	static boolean[] IS_EMPTY;
	static int CNT = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		ARR = new String[N];
		IS_EMPTY = new boolean[N];
		String s = br.readLine();
		
		for (int i = 0; i < N; i++) {
			ARR[i] = Character.toString(s.charAt(i));
		}
		
		for (int i = 0; i < N; i++) {
			if ("P".equals(ARR[i])) {
				for (int j = -M; j <= M; j++) {
					if (i + j >= 0 && i + j < N && "H".equals(ARR[i + j]) && !IS_EMPTY[i + j]) {
						IS_EMPTY[i + j] = true;
						CNT++;
						break;
					}
				}
			}
		}
		
		System.out.println(CNT);
	}
}