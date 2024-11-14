package pkg03_ArrayList;

import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

// java.lang package에 저장된 클래스들은 따로 import 하지 않아도 된다.

public class ArrayListEx {

  /**
   * Mutable 객체
   * 저장된 요소의 갯수를 변경할 수 있다.
   * 크기는 자동으로 조정된다.
   */
  
  public static void a() {
    // ArrayList 선언 : 타입은 List 인터페이스 타입 사용
    List<String> members;
    
    // ArrayList 생성 : 제네릭 타입 생략 가능
    members = new ArrayList<>(); // members = new ArrayList<>(); 기본 크기 10 사용
    
    // 요소 추가하기 (인덱스 0부터 순차적으로 추가된다.)
    members.add("제니");
    members.add("지수");
    members.add("태양");
    members.add("리사");
    members.add("로제");
  
    
    // 요소 삭제하기 (삭제된 요소 자리로 이후 요소들이 이동한다.)
    members.remove(2);
    
    // 요소 수정하기
    
    members.set(0, "jenny");
    members.set(1, "Jisu");
    members.set(2, "Lisa");
    members.set(3, "Rose");
    // 요소 전체 확인
    System.out.println(members);
    
    // 요소 개별 확인
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));
    
    
    // 요소 개수
    
    System.out.println(members.size());
    
  }
  
  /**
   * Immutable 객체
   * 저장된 요소의 갯수를 변경할 수 없다.
   */
  public static void b() {
    //(배열) 초기화를 이용한 ArrayList 생성
    
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
    
    // 요소 수정하기
    numbers.set(0, 100);
    
    // 요소 추가하기
//    numbers.add(60); // Immutable 객체라서 고정되어 추가, 삭제가 안된다.
    
    // 요소 삭제하기
//    numbers.remove(0);  
    
    // 전체 요소 확인
    System.out.println(numbers);
    
  }
  
  public static void c() {
    
    String[] words = {"봄", "여름", "가을", "겨울"};
    List<String> seasons = Arrays.asList(words);
    
    for(int i=0; i < words.length; i++) {
      System.out.println(words[i]);
    }
    
    // size() 메소드를 한 번만 호출할 수 있도록 초기화 영역에서 변수로 처리한다.
    for(int i=0, size = seasons.size(); i < size; i++) {
      System.out.println(seasons.get(i));
    }
    
  }
  
  
  public static void main(String[] args)  {
    a();
    b();
    c();
  }

}