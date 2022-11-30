package com.example.demo;

public class Prog120903 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		
		int answer = 0;
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
            	System.out.println("s1["+i+"] = "+s1[i]);
            	System.out.println("s2["+j+"] = "+s2[j]);
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }
        System.out.println("answer = "+answer);

	}

}
