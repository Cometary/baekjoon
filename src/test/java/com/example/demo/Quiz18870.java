package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Quiz18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 좌표 압축
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int[] list = new int[N];
		for(int i=0;i<N;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(list);
		
		HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>(N);
		
		for(int i=0; i<N; i++) {
			rank.put(list[i], i);
		}
		
	}

}
