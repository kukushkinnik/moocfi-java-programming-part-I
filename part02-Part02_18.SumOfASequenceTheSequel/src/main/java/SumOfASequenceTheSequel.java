
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number?");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Last number?");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is:" + sum);

    }
}
