package html;

public class Main {
    public static void main(String[] args) {
        ParseHtmlByJsoup parse = new ParseHtmlByJsoup();
        String teamsName[] = new String[21];

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
        teamsName[11] = "world-cup-table";
        teamsName[12] = "chinese-super-league-table";
        teamsName[13] = "womens-premier-league-northern-division-table";
        teamsName[14] = "womens-premier-league-southern-division-table";
        teamsName[15] = "football/competitions/scottish-championship/table";
        teamsName[16] = "football/competitions/scottish-league-one/table";
        teamsName[17] = "football/competitions/scottish-league-two/table";
        teamsName[18] = "football/competitions/vanarama-national-league/table";
        teamsName[19] = "football/competitions/vanarama-national-league-north/table";
        teamsName[20] = "football/competitions/vanarama-national-league-south/table";

        for (int i = 0; i < teamsName.length; i++) {
            parse.parserHTML(teamsName[i]);
        }
    }
}
