package html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ParseHtmlByJsoup {

    public void parserHTML(String s) {

        List<String> parseListHtml = new ArrayList<>();
        String tmp;
        try {
            File statText = new File("G:/Tutorial/src/html/statsTest.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);

            Document document = Jsoup.connect("http://www.skysports.com/" + s).get();
            Elements clubRow = document.select("tr.standing-table__row");
            for (Element club : clubRow) {
                parseListHtml.add(club.select("td.standing-table__cell").text());
                tmp = parseListHtml.toString();
                w.write(tmp);
                w.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }



        for (int i = 1; i < parseListHtml.size(); i++) {
           // System.out.println(parseListHtml.get(i));

            
        }


    }
}



