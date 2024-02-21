package com.example.demo.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A12891 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        
        String[] arr = br.readLine().split("");
        Arrays.sort(arr);

        int[] numArr = new int[4];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
        	numArr[i] = Integer.parseInt(st.nextToken());
        }
        
//        int a = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int g = Integer.parseInt(st.nextToken());
//        int t = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        
        int start = 0;
        int end = p - 1; //6
        
        for (int i = 0; i < arr.length - (p - 1); i++) {
        	start = start + i;
        	end = end + i;
			// arr[0] ~ arr[5]
        	// arr[1] ~ arr[6]
        	// arr[2] ~ arr[7]
        		
        	
//        	while (start > end) {
//        		if (arr[i].equals("a")) {
//        			
//        		}
//			}
        }
        

//        for (int i = 0; i < a; i++) {
//            sb.append("a");
//        }
//
//        for (int i = 0; i < c; i++) {
//            sb.append("c");
//        }
//
//        for (int i = 0; i < g; i++) {
//            sb.append("g");
//        }
//
//        for (int i = 0; i < t; i++) {
//            sb.append("t");
//        }

        int cnt = 0;

        

        System.out.println(arr);
    }
}