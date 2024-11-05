package pkg04_logical;

public class LogicalEx {

  public static void main(String[] args) {
    // 논리 연산자
    // 1. AND : &&
    // 2. OR : ||
    // 3. NOT : !
    
    int a = 10;
    int b = 10;
    System.out.println(a > 0 && b > 0);
    System.out.println(a > 0 || b > 0);
    System.out.println(!(a > 0));
    
    // 숏 서킷
    int x = 10;
    System.out.println(x < 0 && ++x == 0); // 숏 서킷에 의해 뒤의 연산은 진행하지 않으므로 x는 증가하지 않는다.
    System.out.println(x); // &&는 false가 발생하면 뒤의 연산은 진행 x
    System.out.println(x > 0 || ++x == 1); // ||는 true가 발생하면 더 이상 연산을 진행하지 않는다.
    System.out.println(x);
    
  }

}
