package com.example.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz3036 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 링 틀렸습니다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] ring = new int[N];
		for(int i=0; i<N; i++) {
			ring[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<N; i++) {
			int pub = Uclid(ring[0],ring[i]);
			bw.write(ring[0]/pub + "/" + ring[i]/pub + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int Uclid(int a, int b) {
		int x,y;
		if(a<b) {
			x=b;
			y=a;
		}else {
			x=a;
			y=b;
		}
		if(a%b!=0) {
			x=a%b;			
		}else {
			return b;
		}	
		return Uclid(x, y);
	}
}
