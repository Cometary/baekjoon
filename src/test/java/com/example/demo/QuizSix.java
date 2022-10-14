package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class QuizSix {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] user = new String[N][2];
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			user[i][0] = st.nextToken();
			user[i][1] = st.nextToken();
		}
		
		Arrays.sort(user, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		for(int k=0; k<N; k++) {
			sb.append(user[k][0] + " " + user[k][1] + "\n");
		}
		
		System.out.println(sb);
		
	}
}
