package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex02 {

  public static void main(String[] args) {
    // 알파벳 대문자 ['A', 'B', ... ,'Z'] -> 배열에 저장하기 
    
    char[] Upper;
    Upper = new char[26];
    
    for(int i = 65; i < 91; i++) {
      Upper[i-65] = (char)i;
    }
    System.out.println(Arrays.toString(Upper));
  
    char[] uppers = new char[26];
    
    for(int i = 0; i < uppers.length; i++) {
      uppers[i] = (char)('A'+ i);
    }
    System.out.println(Arrays.toString(uppers));
  
  }

}
