package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Conn01 {

	public static void main(String[] args) {
		try {
			// 1. 주소 설정 URL 클래스 사용
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
			// 2. 버퍼 연결을 위해 스트림에 접근
			HttpsURLConnection conn =(HttpsURLConnection)url.openConnection(); //conn 논리적인 선
		
			// 3. 버퍼 연결(8192Byte);
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		
			String input=null;
			String download = "";
			while((input = br.readLine()) !=null) {
				download = download + input;
			}
			FileWriter fout = new FileWriter("D:\\index.html");
			fout.write(download);
			System.out.println(download);
			
//			int start = download.indexOf("todaytemp");
//			String r1 = download.substring(start+11, start+13);
			
			Document doc = Jsoup.parse(download); // String을 파싱해서 자바 오브젝트로 변경
			Elements temp = doc.select(".todaytemp"); //Elements : 배열 // select : css선택자
			System.out.println("오늘의 온도는 : "+temp.get(0).text());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
