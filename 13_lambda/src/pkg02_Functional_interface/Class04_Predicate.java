package pkg02_Functional_interface;

import java.util.function.Predicate;

public class Class04_Predicate {

  public static void main(String[] args) {
    
    // Lambda Expression
    
    Predicate<Integer> predicate = number ->number %2 == 0;
    System.out.println(predicate.test(11)) ? "짝수" : "홀수");

    a(number -> number >= 0, 5);
    
    
  }

}
