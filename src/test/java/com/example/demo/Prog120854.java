package com.example.demo;

public class Prog120854 {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		int[] answer = new int[strlist.length];
        for(int i=0; i<strlist.length; i++){
            String size = strlist[i];
            answer[i] = size.length();
        }
	}

}
