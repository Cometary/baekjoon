package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog42576 {

	public static void main(String[] args) {
		//미해결
	}

}

class Solutionq {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        List<String> comp = new ArrayList<>(Arrays.asList(completion));
        
        for(int i=0; i<participant.length; i++){
        int num = comp.indexOf(participant[i]);
        if(num==-1) {
        	answer = participant[i];
        }else{
            comp.remove(num);
        }
            }
        return answer;
    }
}