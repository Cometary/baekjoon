package com.example.demo;

public class Prog120821 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		
		int size = num_list.length;
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            answer[size-i-1] = num_list[i];
        }
        
        System.out.println(answer);

	}

}
