package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class Prog120813 {

	public static void main(String[] args) {
		
		int n = 10;
		
		  ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0; i<=n; i++){
	            if(i%2!=0){
	                list.add(i);
	            }
	        }
	        Integer[] ans = list.toArray(new Integer[list.size()]);
	        int[] answer = Arrays.stream(ans).mapToInt(Integer::intValue).toArray();
        
	        
	}

}
