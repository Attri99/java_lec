package pkg07_BankAccount;

public class BankAccount {

  
  String accNo;
  Long balance;
  
  BankAccount(String accNo, long balance){
    this.accNo = accNo;
    this.balance = balance;
    
  }
  
  /**
   * 입금 처리
   * @param money 입금액. 
   * @exception 마이너스 입금액 불가 
   */
   
   public void deposit(long money) {
    try {
      if (money < 0) {
        throw new RuntimeException(money + "원은 입금할 수 없습니다.");
      }
      balance += money;
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    }  
  
  /**
   * 
   * 출금 처리
   * @param money 출금액. 
   * @return 실제 출금액.
   * @exception 마이너스 출금 불가
   * @exception 잔액보다 큰 금액 출금 불가
   */
  long withdrawal(long money) {
//    if(money <= 0)
//    return 0;
//    if(money > balance)
//     return 0;
//    balance -= money;
//    return money;
    long value = 0l;  
    try {
        if(money <= 0) {
        throw new RuntimeException(money + "원은 출금할 수 없습니다.");
      }
      if(money > balance) {
        throw new RuntimeException("잔액이 부족합니다.");
      }
      balance -= money;
      value = money;            
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
      return value;
    }
  
  /**
   * 이체 처리
   * @param bankAccount 이체할 계좌정보
   * @param money 이체할 금액
   */
  void transfer(BankAccount bankAccount, long money) {
      bankAccount.deposit(this.withdrawal(money));
    
  }
  
  /**
   * 계좌 조회. 계좌번호와 통장잔액을 출력
   */
  void inquiry() {
    System.out.println("BankAccountNo: " + accNo);
    System.out.println("Balance: " + balance);
  }
}

