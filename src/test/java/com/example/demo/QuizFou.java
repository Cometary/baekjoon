package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

public class QuizFou {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(InputStream(System.in));
		
		int anum = scan.nextInt();
		
		int[][] tnum = new int[anum][2];
		
		for(int i=0; i<anum; i++) {
			tnum[i][0] = scan.nextInt();
			tnum[i][1] = scan.nextInt();
		}
		
		for(int k=0; k<anum; k++) {
			System.out.println(tnum[k][0]+" "+tnum[k][1]);
		}
		
//		Comparator<int[]> com1 = new Comparator<int[]>() {
//	        @Override
//	        public int compare(int[] o1, int[] o2) {
//	            return o1[0] -o2[0]; // 반대로 바꾸면 큰값부터 내림차순 정렬
//	        }
//	    };
//	    // 배열의 1번값을 정렬하는 Comparator
//	    Comparator<int[]> com2 = new Comparator<int[]>() {
//	        @Override
//	        public int compare(int[] o1, int[] o2) {
//	            return o1[1] - o2[1];
//	        }
//	    };
//	    // 2차원배열에 물품번호, 가격이 담겨있다고 가정
//	    System.out.println("com1로 정렬---");
//	    Arrays.sort(tnum, com1);
//	    System.out.println("com2로 정렬---");
//	    Arrays.sort(tnum, com2);

	    
	}

	private static Reader InputStream(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
