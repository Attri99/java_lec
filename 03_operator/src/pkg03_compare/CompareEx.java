package pkg03_compare;

public class CompareEx {

  public static void main(String[] args) {
    // 비교 연산
    int a = 10;
    int b = 20;
    
    System.out.println(a > b);
    System.out.println(a >= b);
    System.out.println(a < b);
    System.out.println(a <= b);
    System.out.println(a == b);
    System.out.println(a != b);
    
    String x = "hello"; // x와 y가 가지는 주소값이 같을 뿐 >> 주소 값이 같아 문자열 hello를 동등하게 가져온다.
    String y = "hello";
    System.out.println(x == y); 


  }

}
