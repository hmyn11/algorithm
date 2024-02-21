package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2525 {
	static int A, B, C;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(br.readLine());
		
		// 초단위로 바꾸기
		A = A * 60 * 60;
		B = B * 60;
		C = C * 60;
		
		// 1일 단위 나눈 나머지 구하기
		int second = (int) (A + B + C) % (24 * 60 * 60);
		
		// 시 분으로 나누기
		A = second / (60 * 60);
		B = (second % (60 * 60)) / 60;
		
		System.out.println(A + " " + B);
	}
}