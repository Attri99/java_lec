package pkg03_HttpURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HttpEx {

  public static void main(String[] args) {

    try {
      URL url = new URL("https://www.google.com");
      
      // HttpURLConnection 인스턴스 생성(접속 정보를 관리하는 클래스)
      HttpURLConnection conn = (HttpURLConnection)url.openConnection();
      
      //응답 코드 (정상 : 200, 클라이언트 측 오류 :4xx, 서버 측 오류 :5xx)
      int responseCode = conn.getResponseCode();
      if(responseCode == 200) {
        System.out.println("정상 접속");
      } else {
        System.out.println("접속 불가");
      }
      
      // 요청 메소드 (GET, POST)
      String method = conn.getRequestMethod();
      System.out.println(method);
      
      // 요청 헤더(User-Agent, Content-type, Referer 등)
      String userAgent = conn.getRequestProperty("User-Agent");
      System.out.println(userAgent);
      
      // 접속 해제
      if(conn != null)
        conn.disconnect();
      
      // 모든 요청 헤더 확인
      Map<String, List<String>> map = conn.getRequestProperties();
      for(Entry<String, List<String>> entry : map.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
      }
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
