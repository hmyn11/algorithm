package com.example.demo.basic.fault;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

interface A1253 {
	 public static void main(String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int[] arr = new int[n];

	        StringTokenizer st = new StringTokenizer(br.readLine());

	        for (int i = 0; i < n; i++) {
	            arr[i] = Integer.parseInt(st.nextToken());
	        }

	        Arrays.sort(arr);

	       
	        int cnt = 0;

	        for (int i = 0; i < n; i++) {
	        	int min = 0;
	 	        int max = n - 1;
	 	        
	 	        while (min > max) {
	 	        	if (i == min) {
	 	        		min++;
	 	        	} else if (i == max) {
	 	        		max--;
	 	        	}
	 	        	
	 	        	if (arr[min] + arr[max] > arr[i]) {
		                max--;
		            } else if (arr[min] + arr[max] < arr[i]) {
		                min++;
		            } else {
		                cnt++;
		                break;
		            }
	 	        }
			}

	        br.close();

	        System.out.println(cnt);
	    }

}