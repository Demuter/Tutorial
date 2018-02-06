package html;

public class Main {
    public static void main(String[] args) {
        ParseHtmlByJsoup parse = new ParseHtmlByJsoup();
        String teamsName[] = new String[11];
        teamsName[0] = "la-liga-table";
        teamsName[1] = "eredivisie-table";
        teamsName[2] = "serie-a-table";
        teamsName[3] = "bundesliga-table";
        teamsName[4] = "ligue-1-table";
        teamsName[5] = "mls-table";
        teamsName[6] = "premier-league-table";
        teamsName[7] = "championship-table";
        teamsName[8] = "scottish-premier-table";
        teamsName[9] = "league-1-table";
        teamsName[10] = "league-2-table";

        for (int i = 0; i < teamsName.length; i++) {
            parse.parserHTML(teamsName[i]);
        }
    }
}
