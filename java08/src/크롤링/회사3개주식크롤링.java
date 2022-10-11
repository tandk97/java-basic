package 크롤링;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 회사3개주식크롤링 {
	public static void main(String[] args) {
		String[] code = { "005930", "003490", "034020" };
		String[] company = { "삼성전자", "대한항공", "두산에너빌리티" };

		for (int i = 0; i < company.length; i++) {
			try {
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[i]).get();
				System.out.println("-------------------");
				System.out.println("회사명: " + company[i]);
				
				// 전일가
				Elements list = doc.select("td.first").select(".blind");
				Element tag = list.get(0);
				String yesterday = tag.text(); 
				System.out.println("전일가: " + yesterday);
				
				// 현재가
				Elements list2 = doc.select("div.today").select(".blind");
				Element tag2 = list2.get(0);
				String today = tag2.text(); 
				System.out.println("현재가: " + today);
				// 시가
				Elements list3 = doc.select("td.first").select(".blind");
				Element tag3 = list3.get(1);
				String 시가 = tag3.text();
				System.out.println("시가: " + 시가);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}