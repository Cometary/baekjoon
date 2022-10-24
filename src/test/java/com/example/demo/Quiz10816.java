package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Quiz10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 숫자 카드2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 보유 갯수 N, 검색 갯수 M 
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> card = new HashMap<Integer, Integer>(N);
		int key =0;
		while(st.hasMoreTokens()) {
			key = Integer.parseInt(st.nextToken());
			if(card.get(key)!=null) {
				card.put(key, card.get(key)+1);
			}else {
				card.put(key, 1);
			}
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] res = new int[M];
		
		for(int j=0; j<M; j++) {
			key = Integer.parseInt(st.nextToken());
			if(card.get(key)!=null) {
				res[j] = card.get(key);
			}else {
				res[j] = 0;
			}
		}
		for(int j=0; j<M; j++) {
			System.out.print(res[j]+" ");
		}
	}
}
