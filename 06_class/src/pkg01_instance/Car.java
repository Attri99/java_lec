package pkg01_instance;

// 클래스의 구성 요소
// 1. 필드 : 값 (변수)
// 2. 메소드 : 기능(함수)

public class Car {

  // 필드 (field), 자동 초기화(0, false, null)
  int speed;
  
  // 메소드 (method)
  void drive() {
   // 클래스(car) 타입의 객체(인스턴소) 사용하기
   
    
    // 클래스 car 타입의 객체 선언 : 클래스가 곧 타입이다. (죄다 참조 타입)
    Car myCar;
    
    // 객체 생성 (생성된 객체는 인스턴스이다.) , 객체 = 인스턴스 라고 봐도 무방함
    new Car();
    myCar = new Car();
    
    // 인스턴스가 가지고 있는 멤버 활용하기
    myCar.speed = 50;
    myCar.drive();
  }
}
