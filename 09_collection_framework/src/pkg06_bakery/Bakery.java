package pkg06_bakery;

import java.util.HashMap;
import java.util.Map;

public class Bakery {

  private int bread; // 빵갯수
  private int price; // 빵가격
  private int money; // 자본금
  
  public Bakery(int bread, int price, int money) {
    this.bread = bread;
    this.price = price;
    this.money = money;
  }

  public int getBread() {
    return bread;
  }

  public void setBread(int bread) {
    this.bread = bread;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  //java 의 문법상 두 가지를 리턴할 수 없기 때문에 BreadNChange라는 하나의 클래스로 묶어서 정보를 전달
  /**
   * 판매처리
   * 
   * @param money 고객이 낸 돈
   * @param bread 고객이 사려는 빵의 갯수
   * @return 판매할 빵의 갯수와 잔돈
   */
  public Map<String, Integer> sell(int money, int bread) {
    Map<String, Integer> map = null;
    
    try {
      
      // 판매할 빵이 부족한 경우
      if(this.bread < bread) {
        throw new RuntimeException("빵이 부족해요,");
      }
      
    
    // 고객이 낸 돈이 부족한 상황
    if(money < bread * price) {
      throw new RuntimeException("돈 더 주세요.");
    }
    
    // 판매 처리하기
    this.money += bread * price;
    this.bread -= bread;
    
    // 반환값 만들기
    map = Map.of("bread", bread, "change", money - bread * price);
    
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    // 반환
    return map;
    
   
    
  }
  
}
