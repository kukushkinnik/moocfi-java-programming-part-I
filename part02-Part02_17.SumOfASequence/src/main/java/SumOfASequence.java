
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number?");
        int num = Integer.parseInt(scanner.nextLine());

        int counter  = 1;
        int sum = 0;

        while (counter <= num) {
            sum += counter;
            counter++;

        }
        System.out.println("The sum is " + sum);

    }
}
