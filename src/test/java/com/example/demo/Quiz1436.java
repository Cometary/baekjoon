package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Quiz1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 영화감독 숌
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> six = new ArrayList<Integer>();
		
		for(int i=0; six.size()!=N;i++) {
			String j = Integer.toString(i);
			if(j.contains("666")) {
				six.add(i);
			}
		}
		System.out.println(six.get(N-1));
	}
}
