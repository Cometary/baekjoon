package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Quiz1620 {

	public static void main(String[] args) throws IOException {
		// 나는야 포켓몬 마스터 이다솜
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 포켓몬 수 N, 문제 수 M
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> pok = new HashMap<String, String>(N+N);
		String mon;
		for(int i=1; i<=N;i++) {
			mon = br.readLine();
			pok.put(Integer.toString(i), mon);
			pok.put(mon, Integer.toString(i));
		}
		String[] res = new String[M];
		for(int i=0; i<M; i++) {
			res[i] = pok.get(br.readLine());
		}
		for(int i=0; i<M; i++) {
			System.out.println(res[i]);
		}
		
	}

}
