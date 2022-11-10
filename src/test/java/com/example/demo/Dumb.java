package com.example.demo;

public class Dumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int n) {
        for(int i=2; i<n; i++){
            if(n%i==1){
                return i;
            }
        }
		return n;
    }
}