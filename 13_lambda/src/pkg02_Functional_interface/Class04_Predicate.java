package pkg02_Functional_interface;

import java.util.function.Predicate;

public class Class04_Predicate {

  public static void main(String[] args) {
    
    // Lambda Expression
    
   Predicate<Integer> predicate = number -> number % 2 == 0;
   System.out.println(predicate.test(11) ? "짝수" : "홀수");
    
    // Predicate 매개변수에 Lambda Expression 전달
   a(number -> number >= 0, 5);
   
  }

  public static void a(Predicate<Integer> predicate, int number) {
    System.out.println(predicate.test(number) ? "양수" : "음수");
  }
}
