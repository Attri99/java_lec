package pkg06_concatenate;

public class ConcatenateEx {

  public static void main(String[] args) {
    // 문자열 연결 연산
    
    System.out.println(1 + "살");
    System.out.println(1 + 1 + "살");
    
    int a = 10;
    String str = a + ""; // 변수 a의 문자열 변환 방법, 개발자들이 많이 쓰는 방법이라고 함
    System.out.println(str); // "10"
    
    String addr = "서울특별시";
    addr += "강남";
    addr += "테헤란로";
    System.out.println(addr);

  }

}
