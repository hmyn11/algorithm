package com.example.demo.basic.success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2309 {
	static int N;
	static List<Integer> list = new ArrayList();
	static List<Integer> tempList = new ArrayList();
	static boolean IS_FINISH = false;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 8; j++) {
				tempList = new ArrayList();
				tempList.addAll(list);
				tempList.remove(i);
				tempList.remove(j);
				
				int sum = tempList.stream().mapToInt(Integer::intValue).sum();
				
				if (sum == 100) {
					IS_FINISH = true;
					break;
				}
			}
			
			if (IS_FINISH) {
				break;
			}
		}
		
		Collections.sort(tempList);
		tempList.forEach(i -> System.out.println(i));
	}
}