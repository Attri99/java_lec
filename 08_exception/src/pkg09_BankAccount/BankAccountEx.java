package pkg09_BankAccount;

public class BankAccountEx {

  public static void main(String[] args) {
    try {
      
      // BankAccount 타입의 인스턴스 2개 생성하기
      
      BankAccount myAcc = new BankAccount("010-0000-0000", 500_000);
      BankAccount momAcc = new BankAccount("010-1234-5678", 1_000_000);
      
//      momAcc.transfer(myAcc, -100000);
//     momAcc.transfer(myAcc, 10_000_000);
//      momAcc.deposit(-5);
      momAcc.transfer(myAcc, 10_0000);
      
      myAcc.inquiry();
      momAcc.inquiry();
      
    } catch (BankAccountException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCode());
      
    }

  }

}
