package html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.*;

public class ParseHtmlByJsoup {

    public void parserHTML(File file, String htmlEnd) {

        List<String> parseListHtml = new ArrayList<>();
        try {
            Document document = Jsoup.connect("http://www.skysports.com/" + htmlEnd).get();
            Elements clubRow = document.select("tr.standing-table__row");
            for (Element club : clubRow) {
                parseListHtml.add((club.select("td.standing-table__cell").text()));
                parseListHtml.add("@");
            }

        } catch (IOException excep) {
            excep.printStackTrace();
        }

        String[] arr = parseListHtml.toArray(new String[parseListHtml.size()]);
        System.out.println(Arrays.toString(arr));

        //String[] tokens = Arrays.toString(arr).split("\\s");
        //System.out.println(Arrays.toString(tokens));

        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true), "utf-8"));

            for (int i = 1; i < arr.length; i++){
                writer.write(arr[i].concat("\n"));
            }
            writer.write("*".concat("\n"));
        } catch (IOException excep) {
            excep.printStackTrace();
        }
        finally { try {
                writer.flush();
                writer.close();
            } catch (IOException excep) {
            excep.printStackTrace();
        } }
    }

    public void deleteFile(File file) {
        long diff = new Date().getTime() - file.lastModified();
        if (diff > 0.1 * 24 * 60 * 60 * 1000) {
            System.out.println("The file will be deleted");
            file.delete();
        } else {
            System.out.println("The file willn't be deleted");
        }
    }

    public void checkFile(File file){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    System.out.println("File isn't empty");
                } else {
                    System.out.println("File is empty");
                }
            }
        }catch (IOException excep) {
            excep.printStackTrace();
        }
    }
}


