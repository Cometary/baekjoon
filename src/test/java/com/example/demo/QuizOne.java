package com.example.demo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class QuizOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 처음 숫자 입력
		int leng = scan.nextInt();
		// 입력받은 숫자 길이만큼의 배열 생성
		String[] ex = new String[leng];
		// 결과 값 배열 생성
		int[] sum = new int[leng];
		// 입력받아 저장
		for (int k = 0; k < leng; k++) {
			ex[k] = scan.next();
			// 반복문 (한글자씩 배열로 옮긴다)
			char[] arr = ex[k].toCharArray();
			// 결과 값 배열 생성 (문자열 길이 만큼)
			int[] sco = new int[ex[k].length()];
			// 값 배열 채우기
			int exa = 0;
			for (int i = 0; i < ex[k].length(); i++) {
				if (arr[i] == 'X') {
					exa = 0;
				} else {
					exa += 1;
				}
				sco[i] = exa;
			}
			// 합계 계산
			sum[k] = IntStream.of(sco).sum();
		}
		// 합계 출력
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);        }
	}
}
