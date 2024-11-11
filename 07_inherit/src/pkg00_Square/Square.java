package pkg00_Square;

/*
┌--------------------┐
│   Rectangle        │ 슈퍼 클래스
│--------------------│
│ width              │
│ height             │
│ Rectangle(int, int)│ 
│ getArea()          │ 
└--------------------┘
        ▲
        │
┌--------------┐
│    Square    │ 서브 클래스
│--------------│
│ Square(int)  │ // Square에 전달된 int 값을 각각 Rectangle의 int에 전달한다.
└--------------┘
*/

public class Square extends Rectangle{
  
  // new Square(4)
  
  public Square(int side) {
    super(side, side);
  }
  
  
  
 
  
  
  
  
}
