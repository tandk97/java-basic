package 크롤링;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			//전일가
			Elements list = doc.select("td.first").select(".blind");
			Element tag = list.get(0);
			String yesterday = tag.text();
			System.out.println("전일가 : " + yesterday);
			
			//현재가
			Elements list2 = doc.select("div.today").select(".blind");
			Element tag2 = list2.get(0);
			String today = tag2.text();
			System.out.println("현재가 : " + today);
			
			//시가
			Elements list3 = doc.select("td.first").select(".blind");
			Element tag3 = list3.get(1);
			String 시가 = tag3.text();
			System.out.println("시가 : " + 시가);
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
