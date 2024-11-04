package pkg02_reference;

public class ReferenceEx {

  public static void main(String[] args) {
    // Reference Type (참조 타입)
    
    // String 클래스 : 주소 값(참조 값)을 저장하는 대표 참조 타입, 문자열 저장
    String s = "Hello world";
    System.out.println(s);
    System.out.println(System.identityHashCode(s));
    
    // ReferenceEx 클래스 타입(6장에서 다룰 옞ㅇ)
    ReferenceEx x = new ReferenceEx();
    System.out.println(x);
  }

}