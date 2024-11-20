package pkg02_Functional_interface;

import java.util.function.Supplier;

/*
 * package java.util.function
 * 
 * @FunctionalInterface
 * public interface Supplier<T>{
 *  T get();
 * }
 * */

public class Class01_Supplier {

  public static void main(String[] args) {
    
    // Lambda Expression
   Supplier<String> supplier = () -> "Hello World";
    System.out.println(supplier.get());
    
    //타입이 Supplier인 매개변수로 Lambda Expression 전달
    a(() -> 10);
  }
  
  public static void a(Supplier<Integer> supplier) {
    System.out.println(supplier.get());
}
}