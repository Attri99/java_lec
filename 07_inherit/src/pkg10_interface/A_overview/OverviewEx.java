package pkg10_interface.A_overview;

public class OverviewEx {

  public static void main(String[] args) {
    
    // 
    Shape rect = new Rectangle(1.5, 2.4);
    System.out.println(rect.getCircum()); // 호출은 Shape 타입을 따라갈지라도 실행은 Rectangle 타입에서 한다.
    System.out.println(rect.getArea());
    
    Shape circle = new Circle(3.4);
    System.out.println(circle.getArea());
    System.out.println(circle.getCircum());
    
  }

}
