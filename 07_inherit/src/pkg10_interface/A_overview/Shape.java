package pkg10_interface.A_overview;

/**
 * 인터페이스
 * 1. public abstract 추상 메소드로 구성된다.
 *  -> public abstract 키워드는 생략할 수 있다.(디폴트)
 * 2. public final static 상수로 구성된다.
 *  -> public final static 키워드는 생략할 수 있다.(디폴트)
 * 3. jdk-8(jdk-1.8)0 이후로 추가된 메소드가 있다.
 *  1) 디폴트 메소드
 *    default 반환타입 메소드명(매개 변수){
 *    
 *    }
 *  2) 정적 메소드
 *   static 반환타입 메소드명(매개변수) {
 *   
 *   }
 */
public interface Shape {

  // 도형의 둘레 구하기
  double getCircum();
  
  //도형의 넓이 구하기
  double getArea();
}
