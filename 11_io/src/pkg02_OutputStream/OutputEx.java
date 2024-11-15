package pkg02_OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputEx {

  public static void a() {
    
    // 생성 모드 :  항상 새로 만드는 모드
    
    // 디렉터리
    File dir = new File("\\storage");
    if( !dir.exists() )
      dir.mkdirs();
    
    // 파일
    File file = new File(dir, "sample.dat");
    
    //FileOutputStream (파일 출력 스트림) 인스턴스 선언
    FileOutputStream out = null;
    
    try {
      // FileOutputStream (파일 출력 스트림) 인스턴스 생성 : 파일 생성 시점
      out = new FileOutputStream(file);
      
      // 출력 : 데이터 내보내기 (단위 : int, byte[])
      byte[] b = "pple"
      
      // 출력 : 여러 데이터 내보내기 (단위 : byte[])
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      if ()
    }
  }
  
  
  public static void main(String[] args) {
    a();
    
  }
}
