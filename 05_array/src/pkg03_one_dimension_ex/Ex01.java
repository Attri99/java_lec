package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex01 {

  public static void main(String[] args) {
    // 3단 구구단의 결과를 배열에 저장하기
//    String[] numbers;
//    numbers = new String[9];
//    
//    numbers[0] = "3";
//    numbers[1] = "6";
//    numbers[2] = "9";
//    numbers[3] = "12";
//    numbers[4] = "15";
//    numbers[5] = "18";
//    numbers[6] = "21";
//    numbers[7] = "24";
//    numbers[8] = "27";
//    
//    for(int i = 0; i < 9; i++) {
//      
//    }
//    System.out.println(Arrays.toString(numbers));
    int[] samDan = new int[9];
    
    for(int i = 0; i < samDan.length; i++) {
      samDan[i] = 3 * (i+1);
    }
    
    System.out.println(Arrays.toString(samDan));
  }

}
