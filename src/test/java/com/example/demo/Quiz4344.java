package com.example.demo;


	import java.util.Scanner;
	import java.util.stream.IntStream;

		public class Quiz4344 {

		public static void main(String[] args) {
			// 평균은 넘겠지
			Scanner scan = new Scanner(System.in);
			// 처음 숫자 입력
			int size = scan.nextInt();
			// 퍼센트
			double per[] = new double[size];
			// 왕 for문
			for (int i=0; i<size; i++) {
				int snum = scan.nextInt();
				int[] calc = new int[snum];
				for (int k=0; k<snum; k++) {
					calc[k] = scan.nextInt();
				}
				// 합계 계산
				int sum = IntStream.of(calc).sum();
				// 평균 이상 갯수
				double good = 0;
				for (int j=0; j<snum; j++) {
					if(calc[j]>sum/snum) {
						good += 1;
					}
				}
				per[i] = good*100/snum;
			}
			// 합계 출력
			for (int l = 0; l < size; l++) {
			System.out.printf("%.3f",per[l]);
			System.out.println("%");
			}
		}
	}
