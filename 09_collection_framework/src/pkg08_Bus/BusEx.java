package pkg08_Bus;

public class BusEx {

  public static void main(String[] args) {
    try {
      
      Bus bus = new Bus();
      
      bus.on(new Woman("제시카"));
      bus.on(new Woman("알리사"));
      bus.on(new Woman("준"));
      bus.on(new Woman("레이나"));
      bus.on(new Woman("제트"));
      bus.info();
      
      
      bus.off(1);
      bus.off(2);
      bus.off(3);
      bus.off(4);
      
      bus.info();
      bus.on(new Man("스티브"));
      bus.on(new Man("진"));
      bus.on(new Man("카즈야"));
      bus.on(new Man("브라이언"));
      bus.on(new Man("쿠마"));
      bus.info();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
