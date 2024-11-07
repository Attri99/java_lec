package pkg08_static;

/*
 * 메모리 할당 순서
 * 
 *          영역 : 클래스 영역이 가장 먼저 할당됨 -> 스택 영역           ->  힙 영역
 *          종류 : 클래스, static                    지역 변수             new 키워드로 생성하는 것 (인스턴스, 배열)
 * 라이프 사이클 : 계속 유지                         중괄호 벗어나면 소멸  Garbage Collector가 주기적으로 소멸시킴      
 *               : item, methodB()                                         methodA(),item2
 *                                                                         (인스턴스 멤버)  
 * */



public class Sample {

  static String item;
  String item2; // 인스턴스 멤버
  
  public void methodA() {
    System.out.println("인스턴스 메소드 methodA");
    System.out.println(item);
    System.out.println(item2);
  }
  
  public static void methodB() {
   System.out.println("클래스 메소드 methodB");
   System.out.println(item);
//   System.out.println(item2); 클래스 메소드는 인스턴스 멤버인 item2를 사용할 수 없다.
  }
}
