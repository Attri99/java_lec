package pkg03_constructor;

public class Person {

  private String name;
  
  public Person() {
    
  } // default 형식의 생성자는 무조건 만들어놔야 한다. 누가 가져다 쓸지모르기 때문.

  public Person(String name) {
    super();
    this.name = name;
  } // 여기 생성자가 이미 존재하기 때문에 없다고 하더라도 디폴트가 자동으로 생성되지 않는다.

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  
}
