import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose your number.[1,7]");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt(1, 7);
        System.out.println("(●_-)–ε/̵͇̿/’̿’̿ ̿ ̿ ̿ \uD83D\uDCA5");
        System.out.println(randomNumber);
        if (userNumber == randomNumber) {
            System.out.println("You died");
        } else if (userNumber != randomNumber) {
            System.out.println("You alive");
        }
    }
}