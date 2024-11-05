package pkg01_arithmetic;

public class ArithmeticEx {

  public static void main(String[] args) {
    // 정수 연산
    int a = 5;
    int b = 2;
    System.out.println(a + b); // ctrl + alt + 방향키로 복사 가능
    System.out.println(a - b); 
    System.out.println(a * b); 
    System.out.println(a / b); // 나눈 결과 중 몫
    System.out.println(a % b); // 나눈 결과 중 나머지

    // 실수 연산
    double c = 5;
    double d = 2;
    System.out.println(c + d);
    System.out.println(c - d);
    System.out.println(c * d);
    System.out.println(c / d);
    System.out.println(c % d);
    
    // 증감 연산
    int x = 10;
    System.out.println(x++); // 10
    System.out.println(++x); // 12
    
    int y = 10;
    System.out.println(y--);
    System.out.println(--y);
  }

}
