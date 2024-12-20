package pkg07_Char_Copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharCopyEx {
  
//  public static void a() {
//    File origin = new File("C:\\Program Files\\Java\\jdk-17", "LICENSE");
//    File copy = new File("\\storage", origin.getName());
//    
//    try (FileReader in = new FileReader(origin); 
//        BufferedWriter out = new BufferedWriter(new FileWriter(copy))) {
//      
//      char[] cbuf = new char [4];
//      int readChar = 0;
//            
//      while( (readChar = in.read(cbuf)) != -1) {
//        out.write(cbuf, 0, readChar);
//      }
//      
//      //확인
//      System.out.println(copy.getPath() + "에 복사 완료.");
//      
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }
  
  public static void a() {
    File origin = new File("C:\\Program Files\\Java\\jdk-17", "LICENSE");
    File copy = new File("\\storage", origin.getName());
    
    try (BufferedReader in = new BufferedReader(new FileReader(origin)); 
        BufferedWriter out = new BufferedWriter(new FileWriter(copy))) {
      
      String line = null;
            
      while( (line = in.readLine()) != null) {
        out.write(line + "\n");
      }
      
      //확인
      System.out.println(copy.getPath() + "에 복사 완료.");
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
    a();

  }

}
