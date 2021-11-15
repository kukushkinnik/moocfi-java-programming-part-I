


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;


        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String teamNameToFind = scan.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                String line = reader.nextLine();

                //helps to decide which team is searched now
                boolean givenTeamFoundFirst = false;
                boolean givenTeamFoundSecond = false;

                String[] game= line.split(",");
                String firstTeamName = game[0];
                String secondTeamName = game[1];

                int firstTeamPoints = Integer.parseInt(game[2]);
                int secondTeamPoints = Integer.parseInt(game[3]);

                if(firstTeamName.equals(teamNameToFind)) {
                    gamesPlayed++;
                    givenTeamFoundFirst = true;
                } else if (secondTeamName.equals(teamNameToFind)) {
                    gamesPlayed++;
                    givenTeamFoundSecond = true;
                }

                if (givenTeamFoundFirst && firstTeamPoints > secondTeamPoints)  {
                    wins++;
                } else if (givenTeamFoundFirst && firstTeamPoints < secondTeamPoints) {
                    losses++;
                }

               if (givenTeamFoundSecond && firstTeamPoints < secondTeamPoints) {
                    wins++;
                } else if (givenTeamFoundSecond && firstTeamPoints > secondTeamPoints) {
                   losses++;
               }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
