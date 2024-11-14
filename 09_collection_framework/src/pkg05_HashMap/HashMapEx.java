package pkg05_HashMap;

import java.util.HashMap;
import java.util.Map;

/*
 * Map 인터페이스
 * 1. 하나의 데이터가 쌍(Key, Value)으로 구성되어 있다.
 * 2. 인스턴스를 대체할 수 있다.
 * 3. 구성 요소
 *  1) Key : 데이터 식별자, Set 구조를 가지고 있다.(저장 순서가 없고, 중복된 Key가 없다.)
 *  2) Value : 데이터. 중복 저장 가능하다.
 *  3) Entry : Key와 Value를 합친 하나의 유닛이다.
 * 
 * */
public class HashMapEx {

  /**
   * Mutable 객체
   * 
   *
   */
   public static void a() {
     // HashMap 인스턴스 선언 (Map 인터페이스 타입 사용)
     Map<String, Object> map;
     
     // HashMap 인스턴스 생성
     map = new HashMap<String, Object>();
     
     // Entry 추가 (Key와 Value의 추가)
     map.put("title", "어린왕자");
     map.put("author", "생텍쥐베리");
     map.put("price", 10000);
     map.put("isBestSeller", true);
     
     // Key 중복 체크
     map.put("price", 20000); // price를 20000으로 수정한다.
     
     // 전체 Entry 확인
     System.out.println(map);
     
     // 개별 Entry 확인(Key를 전달하면 해당 value를 확인할 수 있다,)
     System.out.println(map.get("title"));
     System.out.println(map.get("author"));
     System.out.println(map.get("price"));
     System.out.println(map.get("isBestSeller"));
     
     // Value 의 타입은 Object 이다. (= 형 변환이 필요할 수 있다.)
     if((Boolean)map.get("isBestSeller")) {
       System.out.println("베스트셀러");
     } else {
       System.out.println("일반서적");
     }
     
     // Entry 갯수
     System.out.println(map.size());
     
     // Entry 삭제
     map.remove("author");
     System.out.println(map);
     
   }
  public static void main(String[] args) {
    
    a();
  }

}
