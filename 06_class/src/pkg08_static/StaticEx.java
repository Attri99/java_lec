package pkg08_static;

public class StaticEx {

  /*
   * 클래스 멤버
   * 1. 메모리의 클래스 영역에 저장된다.
   * 2. 인스턴스의 생성이 없어도 접근할 수 있다.
   * 3. 멤버 앞에 static 키워드를 추가한다.
   * 4. 클래스로 호출한다. (단 인스턴스로 호출할 수도 있으나 추천하지 않는다.) 
   * */
  public static void main(String[] args) {
    // sample 타입의 인스턴스 s 생성
    
    Sample s = new Sample();
    
    //클래스 필드 호출
    System.out.println(Sample.item);
    //System.out.println(s.item);
    
    //인스턴스 메소드 호출
    s.methodA();
    
    // 클래스 메소드 호출
    Sample.methodB();
    //s.methodB(); // 인스턴스를 이용한 호출은 권장하지 않는다.
  }

}
