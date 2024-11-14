package pkg08_Bus;

public class BusEx {

  public static void main(String[] args) {
    try {
      
      // 좌석 10개를 만든다.
      Bus bus = new Bus();
      
      Seat seats = new Seat();
      
      bus.on(new Seat(person, "톰"));
      bus.info();
      bus.off(3);
      
      bus.info();
      bus.on(new Woman("수지"));
      bus.info();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
