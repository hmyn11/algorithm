package com.example.demo.basic;

import java.util.Scanner;

interface A11720 {
	static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		String num = sc.next();
//		sc.close();
		
//		내가 푼 방법
//		String[] arr = num.split("");
//		int sum = 0;
//		
//		for (int i = 0; i < size; i++) {
//			sum += Integer.parseInt(arr[i]);
//		}
		
//		charAt을 이용한 방법
//		int sum = 0;
//		
//		for (int i = 0; i < size; i++) {
//			sum += num.charAt(i) - '0';
//		}
		
		// getBytes()를 이용한 방법
		Scanner in = new Scanner(System.in);
		in.nextInt();
		
		int sum = 0;
		
		for(byte value : in.next().getBytes()) {
			sum += (value - '0');
		}
		
		System.out.print(sum);
	}
}