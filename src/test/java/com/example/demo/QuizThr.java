package com.example.demo;

import java.util.Scanner;

public class QuizThr {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		int ta = scan.nextInt();
		String ita = Integer.toString(ta);
		StringBuilder revita = new StringBuilder(ita);
		String reva = revita.reverse().toString();
		int ireva = Integer.parseInt(reva);
		
		int tb = scan.nextInt();
		String itb = Integer.toString(tb);
		StringBuilder revitb = new StringBuilder(itb);
		String revb = revitb.reverse().toString();
		int irevb = Integer.parseInt(revb);
		
		if(ireva>irevb) {
			System.out.println(ireva);
		}else {
			System.out.println(irevb);
		}	
	}
}
