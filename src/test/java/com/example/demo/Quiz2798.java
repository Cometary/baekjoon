package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Quiz2798 {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	// 숫자 갯수와 목표 숫자 입력
    	String str = br.readLine();
    	// 입력값 분리
    	StringTokenizer st = new StringTokenizer(str);
    	// N : 숫자 갯수 , M : 목표 숫자, T : 테스트
    	int answer = 0;
    	int N,M = 0;
    	int T = Integer.parseInt(st.nextToken());
    	if(3<=T && T<=100) {
    		N = T;
    	}else {
    		return;
    	}
    	T = Integer.parseInt(st.nextToken());
    	if(10<=T && T<=300000) {
    		M = T;
    	}else {
    		return;
    	}
    	// 인자 입력
    	String nstr = br.readLine();
    	// 인자 분리
    	StringTokenizer nst = new StringTokenizer(nstr);
    	List<Integer> arr = new ArrayList<Integer>();
    	// 인자 배열에 담기
    	while(nst.hasMoreTokens()) {
    		T = Integer.parseInt(nst.nextToken());
    		if(0<T && T<=100000) {
    			arr.add(T);
    		}
    		if(arr.size()==N) {
    			break;
    		}
    	}
    	
        boolean[] visited = new boolean[arr.size()];
        // 합산 결과들 배열에 담기
        List<Integer> res = new ArrayList<Integer>();
        		
        comb(arr, visited, 0, 3, res);
        // 근사값 추출
        int min = Integer.MAX_VALUE;
        for(int i=0; i<res.size(); i++) {
        	int abs = Math.abs(res.get(i) - M);
        	if(abs < min) {
        		min = abs;
        		answer = res.get(i);
        	}
        } 
        System.out.println(answer);
    }
    
	 public static void comb (List<Integer> arr, boolean[] visited, int index, int r, List<Integer> res) {
		 // 숫자 3개 선택하는 모든 경우의 수를 배열에 담는 메서드
	        if (r == 0) {
	        	int sum = 0;
	            for (int i = 0; i < arr.size(); i++) {
	                if (visited[i] == true) {
	                    sum += arr.get(i);
	                }
	            }
	            res.add(sum);
	            return;
	        }
	        if (index == arr.size()) {
	            return;
	        } else {
	            visited[index] = true; // 선택하는 경우
	            comb(arr, visited, index+1, r-1, res);

	            visited[index] = false; // 선택하지 않는 경우
	            comb(arr, visited, index+1, r, res);
	        }
	    }
}
