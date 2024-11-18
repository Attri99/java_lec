package pkg05_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderEx {

  public static void a() {
    
    File file = new File("\\storage", "a.txt");
        
    try (FileReader in = new FileReader(file)){
      
      // 읽을 단위 : 2 글자씩 읽기
      char[] cbuf = new char [2];
      
      // 읽은 데이터를 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // 실제로 읽은 글자 수
      int readChar = 0;
      
      // read(char[]) : 읽은 글자들은 인자에 저장하고 읽은 글자 수를 반환한다. 파일이 끝나면 -1을 반환한다.
      
      while ( (readChar = in.read(cbuf)) != -1){
        builder.append(cbuf, 0, readChar); // 읽어들인 글자수 만큼만 append 하는게 온전히 복사해올수 있다.
      }
      
      //확인
      System.out.println(builder.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void b() {
    File file = new File("\\storage", "b.html");
    
    try (BufferedReader in = new BufferedReader(new FileReader(file))){
      // 읽을 단위 : String
      String line = null;
      
      // 읽을 데이터 저장할 StringBuilder
      StringBuilder builder = new StringBuilder();
      
      // readLine() : BufferedReader 클래스에서 지원하는 메소드, 읽은 라인을 String으로 반환하고, 파일이 끝나면 null을 반환한다.
      while ( (line = in.readLine()) != null) {
        builder.append(line);
      }
      
      System.out.println(builder.toString());
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void c() {
    
    File file =new File("\\storage", "c.html");
    
    // InputStreamReader : 바이트 입력 스트림을 문자 입력 스트림으로 바꾸는 스트림 
    
    try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
      
      String line = null;
      
      StringBuilder builder =  new StringBuilder();
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
  b();
}
}
