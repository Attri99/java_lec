package pkg04_override;

/*
  ┌--------------┐
  │  BlackCoffee │ 슈퍼 클래스
  │--------------│
  │    taste()   │
  └--------------┘
          ▲
          │
  ┌--------------┐
  │   MixCoffee  │ 서브 클래스
  │--------------│
  │   @override  │ Annotation 
  │    taste()   │
  └--------------┘
 */

public class MixCoffee extends BlackCoffee {

    @Override
    public void taste() {
      System.out.println("믹스커피맛");
    }
}
