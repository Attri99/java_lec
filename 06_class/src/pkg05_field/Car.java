package pkg05_field;

/*
 * 필드
 * 1. 클래스에서 선언한 변수이다.
 * 2. 일반 변수와 달리 자동초기화가 진행된다. (0, false, null)
 *  
 * */
public class Car {

  int speed; // int speed = 0;
  int fuel;  // int fuel = 0;
  final int LIMIT = 100;
  
  void accel() {
    if(fuel==0)
      return;
    if (speed ==LIMIT)
      return;
    
    speed++; 
    }
    void brake() {
      if(speed == 0)
        return;
      speed--;
    }
    
   void gasStation(int fuel) {
     this.fuel  += fuel;
     // this : gasStaiton 메소드를 호출한 인스턴스
     // 클래스 내부의 멤버를 호출할때 사용된다.
   }
   
   void panel() {
     System.out.println("SPEED: " + speed + "FUEL: " + fuel);
   }
     
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
