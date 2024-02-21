package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1541 {
	static int sum = Integer.MAX_VALUE; // 초기 상태 여부를 확인하기 위한 값으로 설정
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		// 50 + 70 + 7 - 40 + 90 - 10 - 60 + 80
		// 50 + 70 + 7 - (40+90) - 10 - (60 + 80)
		
		StringTokenizer st = new StringTokenizer(s, "-");
		
		while (st.hasMoreTokens()) {
			int temp = 0;
			StringTokenizer str = new StringTokenizer(st.nextToken(), "+");
			
			while (str.hasMoreTokens()) {
				temp += Integer.parseInt(str.nextToken());
			}
			
			if (sum == Integer.MAX_VALUE) { // 첫 번째 토큰인 경우는 temp값 그대로가 첫 번째 수가 된다
				sum = temp;
			} else { // 처음을 제외한 나머지는 다 뺀다
				sum -= temp;
			}
		}
		
		System.out.println(sum);
	}
}