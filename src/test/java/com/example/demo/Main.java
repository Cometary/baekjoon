package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.List;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    //scan 처럼 int 받아오기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int fir = Integer.parseInt(br.readLine());
   //OX스트링 받을 배열
    String[] sor = new String[fir];
    //정답을 받을 배열 add쓰기위에 List로 씀 []이거쓰면 인덱스써서 더해줘야됨
    List<Integer> soi = new ArrayList<Integer>();
    //입력받은 OX글자를 잠시 보관하기위한 공간
    String etc = "";
    //String출력할때 더 빠른것
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < fir; i++) {
      //scan처럼 String받아오는거
      etc = br.readLine();
      sor[i] = etc;
    }
    //O가 나오면 어느숫자를 더해줄지 기준 +1해서 sum에 더하기해줌 (한줄 기준)
    int cou = 0;
    //이때까지 더해준 총값(한줄 기준)
    int sum=0;
    //입력받은 String배열 for문 도는것
    for (String li : sor) {
     //글자 갯수만큼 for문돌아서 모든 글자 검사하게 하기
      for (int j = 0; j < li.length(); j++) {
        //O이면 cou에 1더해주고 그 값음 suma에 더해준다.
        if (li.charAt(j) == 'O') {
          cou = cou + 1;
          sum+=cou;
        } else {
          //X면 cou값을 초기화해줘서 다음에 1부터 더해줄수 있도록 한다.
            cou=0;        
        }
        //for문 마지막이면 배열에 sum을 더해주고 sum,cou를 초기화해준다.
        if(j==li.length()-1) {
         
          soi.add(sum);
        
          sum=0;
          cou=0;
        }
        
      }
      
    }
    //Stringbuilder를 이용해서 출력할 String을 만든다
    for (int y = 0; y < fir; y++) {
      sb.append(soi.get(y)).append("\n");
    }
  //출력
    System.out.println(sb);
  }
}