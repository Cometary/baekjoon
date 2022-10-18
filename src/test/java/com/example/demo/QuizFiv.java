package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuizFiv {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		// 몇개 일까요?
		int count = 0;
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			char[] sub = new char[str.length()];
			int[] res = new int[str.length()];
			
			for(int k=0; k<str.length(); k++) {
				sub[k] = str.charAt(k);
			}
			res[0]=-1;
			for(int k=1; k<str.length(); k++) {
				if(sub[k]!=sub[k-1]) {
					res[k] = str.lastIndexOf(sub[k], k-1);
				}else {
					res[k] = -1;
				}
			}
			int con = 0;
			for(int k=0; k<str.length(); k++) {
				if(res[k]!=-1) {
					con += 1;
				}
			}
			if(con==0) {
				count += 1;
			}	
		}
		System.out.println(count);
	}

}
