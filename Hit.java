import java.util.Scanner;
import java.util.Random;

public class Hit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your passord: ");
        String pasw = scanner.nextLine();
        scanner.close();
        String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        Random random = new Random();
        while (true) {
            StringBuilder guessedpwd = new StringBuilder();
            for (int i = 0; i < pasw.length(); i++) {
                int index = random.nextInt(characters.length());
                guessedpwd.append(characters.charAt(index));
            }
            System.out.println(guessedpwd);

            if (pasw.equals(guessedpwd.toString())) {
                System.out.println("\nYour passord is: " + guessedpwd);
                break;
            }
        }
    }
}
