import java.util.Arrays;
import java.util.Random;

public class HillelHomework11Program {

    public static void main(String[] args) {
        Random random = new Random();
        final int teamsAmount = 2;
        final int playersAmount = 25;

        int[][] teams = new int[teamsAmount][playersAmount];

        for (int i = 0; i < teamsAmount; i++) {
            for (int j = 0; j < playersAmount; j++) {
                teams[i][j] = random.nextInt(23) + 18;
            }
        }

        for (int i = 0; i < teamsAmount; i++) {
            double totalAge = 0;
            for (int j = 0; j < playersAmount; j++) totalAge += teams[i][j];

            System.out.println("Team " + (i + 1) + ": " + Arrays.toString(teams[i]));
            System.out.println("Average age team " + (i + 1) + ": " + totalAge / (double)teams[i].length);
        }
    }
}
