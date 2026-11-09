import java.util.Random;
import java.util.Scanner;

public class Verify {
    void main (String[] Args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] tokens = new int[6];
        String generatedToken = "";

        for (int i = 0; i < 6; i++) {
    generatedToken += random.nextInt(0, 10);
        }

        IO.print("Your tokens are: " + generatedToken);

        IO.print("Please enter your token: ");
        String enterToken = scanner.nextLine();

        if (enterToken.equals(generatedToken)) {
            IO.println("Correct Answer");
        } else {
            while (!enterToken.equals(generatedToken)) {
                IO.print("Incorrect token! Try again: ");
                enterToken = scanner.nextLine();

            if (!enterToken.equals(generatedToken)) {
                IO.print("\033[1A");
                IO.print("\033[2K");
                } else {
                    IO.println("Correct Answer");
                }
            }
        }

        scanner.close();
    }
}