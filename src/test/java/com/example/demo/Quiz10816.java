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
		while(st.hasMoreTokens()) {
			int key = Integer.parseInt(st.nextToken());
			if(card.get(key)!=null) {
				card.put(key, card.get(key)+1);
			}else {
				card.put(key, 1);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int j=0; j<M; j++) {
			int key = Integer.parseInt(st.nextToken());
			if(card.get(key)!=null) {
				System.out.print(card.get(key)+" ");
			}else {
				System.out.print(0+" ");
			}
		}	
	}
}
