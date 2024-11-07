package pkg09_Member;

public class Member {

  private String name;
  private Address address;
  private Contact contact;
  
  public Member(String name, Address address, Contact contact) {
    this.name = name;
    this.address = address;
    this.contact = contact;
  }
  
  public void info() {
    System.out.println(name);
    address.info();
    contact.info(); // address와 contact에 있는 info함수 호출하기
  }
} 
