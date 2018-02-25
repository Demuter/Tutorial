package html;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParseHtmlByJsoup parse = new ParseHtmlByJsoup();
        String teamsName[] = new String[21];
        File file = new File("filename.txt");

        parse.deleteFile(file);
        parse.checkFile(file);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number from 0 to 21: ");
        int input = in.nextInt();

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

        switch (input) {
            case 0:  parse.parserHTML(file, teamsName[0]);
                break;
            case 1:  parse.parserHTML(file, teamsName[1]);
                break;
            case 2:  parse.parserHTML(file, teamsName[2]);
                break;
            case 3:  parse.parserHTML(file, teamsName[3]);
                break;
            case 4:  parse.parserHTML(file, teamsName[4]);
                break;
            case 5:  parse.parserHTML(file, teamsName[5]);
                break;
            case 6:  parse.parserHTML(file, teamsName[6]);
                break;
            case 7:  parse.parserHTML(file, teamsName[7]);
                break;
            case 8:  parse.parserHTML(file, teamsName[8]);
                break;
            case 9:  parse.parserHTML(file, teamsName[9]);
                break;
            case 10: parse.parserHTML(file, teamsName[10]);
                break;
            case 11: parse.parserHTML(file, teamsName[11]);
                break;
            case 12: parse.parserHTML(file, teamsName[12]);
                break;
            case 13: parse.parserHTML(file, teamsName[13]);
                break;
            case 14: parse.parserHTML(file, teamsName[14]);
                break;
            case 15: parse.parserHTML(file, teamsName[15]);
                break;
            case 16: parse.parserHTML(file, teamsName[16]);
                break;
            case 17: parse.parserHTML(file, teamsName[17]);
                break;
            case 18: parse.parserHTML(file, teamsName[18]);
                break;
            case 19: parse.parserHTML(file, teamsName[19]);
                break;
            case 20: parse.parserHTML(file, teamsName[20]);
                break;
            case 21: {
                for (int i = 0; i < teamsName.length; i++){
                    parse.parserHTML(file, teamsName[i]);
                }
                break;
            }
            default:
                System.out.println("Error!");
                break;
        }
    }
}
