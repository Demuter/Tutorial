package html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ParseHtmlByJsoup {


    public void writing(String s) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("myFile.txt"), StandardCharsets.UTF_8))) {
            writer.write(s);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

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

        String tmp;

        for (int i = 1; i < parseListHtml.size(); i++) {
           // System.out.println(parseListHtml.get(i));

            tmp = parseListHtml.get(i);
            //System.out.println(tmp);
            writing(tmp);
        }


    }
}



