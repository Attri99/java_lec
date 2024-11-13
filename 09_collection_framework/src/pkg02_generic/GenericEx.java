package pkg02_generic;

import java.util.Arrays;

public class GenericEx {

  public static void main(String[] args) {
    
    // 정수 저장 Container
    Container<Integer> container1 = new Container<Integer>();
    container1.setItem(10);
    System.out.println(container1.getItem());
    
    
    // 실수 저장 Container
    Container<Double> container2 = new Container<Double>();
    container2.setItem(10.5);
    System.out.println(container2.getItem());
  
    // Car 저장 Container
    Container<Car> container3 = new Container<Car>();
    container3.setItem(new Car("bmw", "x7"));
    System.out.println(container3.getItem().getBrand());
    System.out.println(container3.getItem().getModel());
    System.out.println(container3.getItem()); // .toString()이 생략 가능하기 때문에 Car 클래스에서 Override 해줘야 한다.
    
    
  }
  }
