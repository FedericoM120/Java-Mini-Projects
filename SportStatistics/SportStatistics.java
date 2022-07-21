
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();

        ArrayList<Game> games = new ArrayList<>();

        try ( Scanner userInputScanner = new Scanner(Paths.get(file))) {
            while (userInputScanner.hasNextLine()) {
                String line = userInputScanner.nextLine();

                String[] parts = line.split(",");
                String nameOne = parts[0];
                String nameTwo = parts[1];
                int scoreOne = Integer.valueOf(parts[2]);
                int scoreTwo = Integer.valueOf(parts[3]);

                games.add(new Game(nameOne, nameTwo, scoreOne, scoreTwo));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        int count = 0;
        int wins = 0;
        int losses = 0;

        for (Game game: games) {
            //System.out.println(game.toString());
            String test = game.toString();
            if (test.contains(team)) {
                count++;
                if (game.winner().equals(team)) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }

}
