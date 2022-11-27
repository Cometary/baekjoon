package com.example.demo;

public class Prog120824 {

	public static void main(String[] args) {

		int[] num_list = {1, 2, 3, 4};
		int[] answer = {};
        int odd = 0;
        int even = 0;
        for(int i=0; i<num_list.length; i++){
        	System.out.println(num_list[i]+"를 2로 나눔 "+num_list[i]/2);
            if(num_list[i]%2==0){
                even += 1;
            }else{
                odd+=1;
            }
        }
        answer = new int[]{even, odd};

        System.out.println("짝수는 "+answer[0]);
        System.out.println("홀수는 "+answer[1]);

	}

}
