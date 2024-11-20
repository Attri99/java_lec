package pkg02_Functional_interface;

import java.util.function.Consumer;

public class Class02_Consumer {

  public static void main(String[] args) {
    // Lambda Expression
    
    Consumer<String> consumer = t -> System.out.println(t);
    consumer.accept("hello World");
    
    // consumer 타입의 매개변수로 Lambda Expression 전달하기
    a(number -> System.out.println(number));

  }

}
