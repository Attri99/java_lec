package pkg05_openapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OpenAPIEx {

  public static void a() throws Exception {

    try {

      String servicekey = "MRLCcOOyTiDPZEU%2BCvqn2%2BLRAhaGLAhLVBADw8519i4laKBlv7MiM4%2BCdBKZTbtdot2piTav6ajyq%2Bk9uqyE6w%3D%3D";

      StringBuilder builder = new StringBuilder();
      builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
      builder.append("?servicekey=").append(servicekey);
      builder.append("&pageNo=").append(1);
      builder.append("&numOfRows=").append(1000);
      builder.append("&base_date=").append(20241118);
      builder.append("&base_time=").append(0600);
      builder.append("&nx=").append(61);
      builder.append("&ny=").append(125);

      URL url = new URL(builder.toString());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();

      BufferedReader in = null;
      if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      } else {
        in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
      }

      StringBuilder responseBody = new StringBuilder();
      String line = null;
      while ((line = in.readLine()) != null)
        responseBody.append(line);

      System.out.println(responseBody.toString());

      in.close();
      conn.disconnect();

      //XML -> JSONObject로 바꾸는 법
//      org.json.JSONObject obj = XML.toJSONObject(responseBody.toString());
//      System.out.println(obj);
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void b() throws Exception {

    String servicekey = "MRLCcOOyTiDPZEU%2BCvqn2%2BLRAhaGLAhLVBADw8519i4laKBlv7MiM4%2BCdBKZTbtdot2piTav6ajyq%2Bk9uqyE6w%3D%3D";

    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?servicekey=").append(servicekey);
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);

    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = builderFactory.newDocumentBuilder();
    Document doc = docBuilder.parse(builder.toString());

    doc.getDocumentElement().normalize();
    System.out.println("Root tag : " + doc.getDocumentElement().getNodeName()); // response code 확인

    NodeList nodeList = doc.getElementsByTagName("item"); // <item> 태그 모두 가져오기
    System.out.println("노드 갯수 : " + nodeList.getLength()); // 700 <item> 태그

    System.out.println(nodeList.item(0).getNodeName());
    System.out.println(nodeList.item(0).getChildNodes().getLength());

    for (int i = 0, length = nodeList.getLength(); i < length; i++) {

      Node node = nodeList.item(i); // 각 item 태그
      System.out.println(((Element) node).getElementsByTagName("baseDate").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("baseTime").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("category").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstDate").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstTime").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstValue").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("nx").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("ny").item(0).getTextContent());
      System.out.println("--------------");

    }
  }

  public static void c() throws Exception {

//      // JSONObject 사용법
//      JSONObject obj = new JSONObject("{\"name\": \"kim\", \"age\" : 30}");
//      System.out.println(obj.getString("name"));
//      System.out.println(obj.getInt("age"));
//      
    try {

      String servicekey = "MRLCcOOyTiDPZEU%2BCvqn2%2BLRAhaGLAhLVBADw8519i4laKBlv7MiM4%2BCdBKZTbtdot2piTav6ajyq%2Bk9uqyE6w%3D%3D";

      StringBuilder builder = new StringBuilder();
      builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
      builder.append("?servicekey=").append(servicekey);
      builder.append("&pageNo=").append(1);
      builder.append("&numOfRows=").append(1000);
      builder.append("&base_date=").append(20241118);
      builder.append("&base_time=").append(0600);
      builder.append("&nx=").append(61);
      builder.append("&ny=").append(125);
      builder.append("&dataType=").append("JSON");

      URL url = new URL(builder.toString());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();

      BufferedReader in = null;
      if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      } else {
        in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
      }

      StringBuilder responseBody = new StringBuilder();
      String line = null;
      while ((line = in.readLine()) != null)
        responseBody.append(line);

      System.out.println(responseBody.toString());

      in.close();
      conn.disconnect();
      
      JSONArray item = new JSONObject(responseBody.toString())
          .getJSONObject("response")
          .getJSONObject("body")
          .getJSONObject("items")
          .getJSONArray("item");
      //System.out.println(item.length());
      //System.out.println(item.getJSONObject(0).getString("category"));

      for(int i = 0, length = item.length(); i < length; i++) {
        System.out.println(item.getJSONObject(i).getString("baseDate"));
        System.out.println(item.getJSONObject(i).getString("baseTime"));
        System.out.println(item.getJSONObject(i).getString("category"));
        System.out.println(item.getJSONObject(i).getString("fcstDate"));
        System.out.println(item.getJSONObject(i).getString("fcstTime"));
        System.out.println(item.getJSONObject(i).getString("fcstValue"));
        System.out.println(item.getJSONObject(i).getInt("nx"));
        System.out.println(item.getJSONObject(i).getInt("ny"));
        System.out.println("----------------");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
  
  public static void d() {
    try {
    
      // XML 받아서 JSONObject로 바꿔주기
    String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168066000";
    
    StringBuilder builder = new StringBuilder();
    builder.append(apiURL);
    
      URL url = new URL(builder.toString());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      
      BufferedReader in = null;
      if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      } else {
        in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
      }
      
      StringBuilder responseBody = new StringBuilder();
      String line = null;
      while ((line = in.readLine()) != null) {
        responseBody.append(line);
      }
      
      in.close();
      conn.disconnect();
      
      JSONObject obj = XML.toJSONObject(responseBody.toString());
      System.out.println(obj);
    
      JSONArray item = obj
                        .getJSONObject("rss")
                        .getJSONObject("channel")
                        .getJSONObject("item")
                        .getJSONObject("description")
                        .getJSONObject("body")
                        .getJSONArray("data");
    
      for (int i=0, length = item.length(); i < length; i++) {
        System.out.println(item.getJSONObject(i).getInt("hour"));
        System.out.println(item.getJSONObject(i).getDouble("temp"));
        System.out.println(item.getJSONObject(i).getDouble("tmx"));
        System.out.println(item.getJSONObject(i).getDouble("tmn"));
        System.out.println(item.getJSONObject(i).getString("wfKor"));
        System.out.println("----------------");
        
      }
    
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void e() throws Exception{
    
    // 기상청 RSS (XML 받아서 Document 이용해서 파싱하기)
    
    String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168066000";
    
    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = builderFactory.newDocumentBuilder();
    Document doc = docBuilder.parse(apiURL);
    
    doc.getDocumentElement().normalize();
    
    NodeList nodeList = doc.getElementsByTagName("data"); //19개의 data xorm
    
    for(int i=0, length = nodeList.getLength(); i<length; i++) {
      
      Node node = nodeList.item(i); // 각 <data> 태그
      Element element = (Element) node; // getElementsByTagName() 메소드 사용을 위해 Node -> Element로 Downcasting
      System.out.println("hour : " + element.getElementsByTagName("hour").item(0).getTextContent());
      System.out.println("temp : " + element.getElementsByTagName("temp").item(0).getTextContent());
      System.out.println("tmx : " + element.getElementsByTagName("tmx").item(0).getTextContent());
      System.out.println("tmn : " + element.getElementsByTagName("tmn").item(0).getTextContent());
      System.out.println("wfKor : " + element.getElementsByTagName("wfKor").item(0).getTextContent());
      System.out.println("---------------");
    }
    
    
    
  }
  
  public static void main(String[] args) throws Exception {

    d();
  }

}
