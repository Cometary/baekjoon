package com.example.demo;

import java.util.HashSet;

public class Prog1845 {
	// 미해결
	Solution sol = new Solution();
	int[] numm = new int[]{1, 2, 3, 3};
	sol.solution(numm);
	
	
	class Solution {
		public int solution(int[] nums) {
			int x = nums.length;
			x = x/2;
			HashSet<Integer> hashSet = new HashSet<>();
			for(int num : nums) {
				hashSet.add(num);
			}
			String[] resultArr = hashSet.toArray(new String[0]);
			
			int y = resultArr.length;
			
			int answer = 0;
			if(x>y){
				answer = y;
			}else{
				answer = x;
			}
			return answer;
		}
	}
	
}
