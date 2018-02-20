package html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseHtmlByJsoup {



    public void parserHTML(String s) {

        List<String> parseListHtml = new ArrayList<>();
        try {
            Document document = Jsoup.connect("http://www.skysports.com/" + s).get();
            Elements clubRow = document.select("tr.standing-table__row");
            for (Element club : clubRow) {
                parseListHtml.add(club.select("td.standing-table__cell").text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//      for (int i = 1; i < parseListHtml.size(); i++) {
//          System.out.println(parseListHtml.get(i));
//      }
    }
}



