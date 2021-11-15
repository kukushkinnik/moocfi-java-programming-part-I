
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
       String number = scanner.nextLine();
       int num = Integer.parseInt(number);
        System.out.println("You gave the number " + num);

    }
}
