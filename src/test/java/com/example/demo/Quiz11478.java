package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Quiz11478 {

	public static void main(String[] args) throws IOException {
		// 서로 다른 부분 문자열의 개수 메모리 해결합시다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = str.length();
		String[] ast = str.split("");
		HashSet<String> arr = new HashSet<String>();
		
		for(int i=0; i<N; i++) {
			String dumb = ast[i];
			arr.add(dumb);
			for(int j=i+1; j<N; j++) {
				dumb = dumb + ast[j];
				arr.add(dumb);
			}
		}
		System.out.println(arr.size());
	}

}
