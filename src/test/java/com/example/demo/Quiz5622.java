package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz5622 {

	public static void main(String[] args) throws IOException {
		// 다이얼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char[] ch = new char[str.length()];
		int[] time = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			time[i] = ch[i]-64;
		}
		for(int i=0; i<str.length(); i++) {
			switch(time[i]) {
			case 1: case 2: case 3: time[i] = 3; break;
			case 4: case 5: case 6: time[i] = 4; break;
			case 7: case 8: case 9: time[i] = 5; break;
			case 10: case 11: case 12: time[i] = 6; break;
			case 13: case 14: case 15: time[i] = 7; break;
			case 16: case 17: case 18: case 19: time[i] = 8; break;
			case 20: case 21: case 22: time[i] = 9; break;
			case 23: case 24: case 25: case 26: time[i] = 10; break;
			}
		}
		int answer = 0;
		for(int i=0; i<str.length(); i++) {
			answer += time[i];
		}
		System.out.println(answer);
	}
}
