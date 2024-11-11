package pkg08_object;

public class ObjectEx {

  public static void main(String[] args) {
    // Object 타입의 인스턴스 car 생성
    
    Object car = new Car("benz", "E380");
    
    // 인스턴스 car를 Car 타입으로 변환(Downcasting)
    if(car instanceof Car) {
      System.out.println(((Car)car).getBrand());
      System.out.println(((Car)car).getModel());
    }
    
    // Car 타입의 인스턴스 car2 생성
    Car car2 = new Car("bmw", "520d");
    
   // 이 둘은 동일한 코드이다.
    System.out.println(car2);
    System.out.println(car2.toString()); 

  }

}
