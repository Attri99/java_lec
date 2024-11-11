package pkg00_Carrier;

/*
┌------------┐
│   Coffee   │ 슈퍼 클래스
│------------│
│ name(str)  │
└------------┘
       ▲         
       │
┌--------------┐
│ Espresso     │
│--------------│
│              │ 
└--------------┘
       ▲         
       │
┌--------------┐
│ Americano    │
│--------------│
│              │ 
└--------------┘
*/



public class Coffee {

  private String name;

  
  public Coffee() {
    
  }
  
  public Coffee(String name) {
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  
}
