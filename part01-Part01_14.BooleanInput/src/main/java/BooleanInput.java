
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        String value = scanner.nextLine();
        boolean val = Boolean.parseBoolean(value);
        System.out.println("True or false? " + val);

    }
}
