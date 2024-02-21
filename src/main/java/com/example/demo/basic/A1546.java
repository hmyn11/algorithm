package com.example.demo.basic;

import java.util.Arrays;
import java.util.Scanner;

interface A1546 {
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		
		// 1. 과목 중에 숫자가 제일 높은거 하나 선택하기 - n
		// 2. 점수/n * 100
		// 3. 평균 값 = 2번 점수들의 합/size
		
		Arrays.sort(arr);
		int max = arr[size-1];
		double sum = 0;
		
		for (int i = 0; i < size; i++) {
			sum += (double) arr[i]/max * 100;
		}
		
		System.out.println((double) sum/size);
	}
}