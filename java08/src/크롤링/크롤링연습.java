package 크롤링;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.naver").get();
			Elements list = doc.select("td.title");
			for (int i =0; i<list.size(); i++) {
				Element tag = list.get(i);	
				String movie = tag.text();
				System.out.println("영화 순위 " + (i+1) + "위 : " + movie);
			}
			System.out.println(list.size());
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

