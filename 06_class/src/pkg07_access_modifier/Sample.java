package pkg07_access_modifier;
/*
 * 접근 권한
 * 1. public : 누구나 접근 가능
 * 2. protected : 동일 패키지 또는 상속관계 class에서 접근 가능
 * 3. default : 동일 패키지에서 접근 가능 (접근 권한이 없는 경우 사용됨, 키워드가 아님)
 * 4. private : 동일 클래스에서 접근 가능
 */

/*
 * 정보 은닉
 * 객체(인스턴스)가 가진 정보(데이터, 정확히 필드)를 안전한게 보호한다.
 * 외부에서는 접근할 수 없도록 막는다.
 */


/*
 *Getter와 setter
 *1. Getter : 필드값을 반환하는 메소드. Get + 필드명으로 이름을 만든다.
 *2. Setter : 필드값을 저장하는 메소드. Set + 필드명으로 이름을 만든다.
 *3. 이클립스의 코드 자동 완성을 권장한다. 
 * */



public class Sample {
  
  private String item;

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }
  
  
  }

