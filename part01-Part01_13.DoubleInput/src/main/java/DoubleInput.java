
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String value = scanner.nextLine();
        double num = Double.parseDouble(value);
        System.out.println("You gave the number " + num);

    }
}
