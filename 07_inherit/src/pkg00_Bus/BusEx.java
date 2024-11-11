package pkg00_Bus;

public class BusEx {

  public static void main(String[] args) {
    Bus bus = new Bus(5);
    
    bus.on(new Man("톰"));
    bus.on(new Man("브레드"));
    bus.on(new Man("라이언"));
    bus.on(new Man("킹"));
    bus.on(new Man("브라이언"));
    bus.on(new Man("스티브"));

    bus.info();
    
    bus.off(3);
    
    bus.info();
    bus.on(new Woman("수지"));
    bus.info();
  }

}
