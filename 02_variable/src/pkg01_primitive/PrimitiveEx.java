package pkg01_primitive;

public class PrimitiveEx {

  public static void main(String[] args) {
    
    //primitive Type (기본 타입)
    
    // 1. byte : 1바이트 정수 저장, -128 ~ 127까지 256개의 범위
    byte a; // 변수 a에는 쓰레기(Garbage)가 저장되어 있다.
    a = 127;
    System.out.println(a);
    
    // 2. short : 2바이트 정수 - 사용 안 함 
    short b = 32767;
    System.out.println(b);
    
    // 3. int : 4바이트 정수 - 기본 정수 타입
    int c = 2147483647;
    System.out.println(c);
    
    // 4. long : 8바이트 정수 - int로 커버 불가능한 값에서 사용
    long d = 2147483648L; // long 타입의 값은 마지막에 L(l)을 추가 (int 범위를 벗어난 값은 필수, 아니면 생략 가능)
    System.out.println(d);
  
    // 5. float : 4바이트 실수 - short과 같은 이유로 사용하지 않음
    float e = 1.111111f; // float 타입의 값은 마지막에 F(f)를 추가
    System.out.println(e);
    
    // 6. double : 8바이트 실수 - 기본 실수 타입;
    double f = 1.1111111111;
    System.out.println(f);
    
    // 7. char(character) : 2바이트 문자 - ASCII 코드(1바이트), 유니코드(2바이트)
    char g = '홍';
    System.out.println(g);
    
    // 8. boolean : 이론상 1비트 (실제는 JVM이 담당), true 또는 False 젖장
    boolean h = true;
    System.out.println(h);
    
    
    
  }

}
