package pkg08_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {

  private List<Seat> seats;
  private int numOfPerson;
  private Person person;

  public Bus() {
    seats = new ArrayList<Seat>();

  }

  public List<Seat> getSeats() {
    return seats;
  }
  
  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }
  
  public Person getPerson() {
    return person;
  }
  
  public void setPerson(Person person) {
    this.person = person;
  }

  // 버스 탑승 (빈 좌석 앞자리부터 채우기, 입석 금지)



  int size = seats.size();

  public void on(Seat person) throws RuntimeException {
    // 입석 금지
    if (numOfPerson > size) {
      throw new RuntimeException("만석입니다. 다음 버스를 이용해 주세요.");

    }
    seats.add(person);
  }

  // 버스 하차(내리는 사람의 좌석 번호를 이용해서 하차)
  public void off(int seatNo) throws RuntimeException {

    if (seatNo < 0 || seatNo >= size) {
      throw new RuntimeException("좌석 번호가 잘못 전달되었습니다.");
    }
    seats.remove(seatNo);
    numOfPerson--;
  }

  // 버스 명단 (1번 좌석 : 홍길동, 2번 좌석 : 비어 있음..)
  public void info() {
    for (int i = 0; i < size; i++) {
      Person p = seats.get(i).getPerson(); // 각 좌석에 앉은 사람
      if (p == null)
        System.out.println(String.format("%02d", i + 1) + "번 좌석: 비어 있음");
      else {
        System.out.println(String.format("%02d", i + 1) + "번 좌석: " + p.getName());
      }
    }
  }

}
