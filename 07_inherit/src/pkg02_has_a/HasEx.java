package pkg02_has_a;

public class HasEx {
  /*
  ┌--------------┐
  │      Pen     │ 슈퍼 클래스
  │--------------│
  │   drawing()  │
  │              │
  └--------------┘
          ▲
          │
  ┌--------------┐
  │   Person     │ 서브 클래스
  │--------------│
  │    eat()     │
  │   sleep()    │
  └--------------┘
*/
  public static void main(String[] args) {
    Person person = new Person();
    person.drawing();
    person.eat();
    person.sleep();

  }

}
