
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avrg = 0.0;
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                counter++;
                sum += number;
            }
        }
        avrg = (double)sum / counter;
        System.out.println("Average of the numbers: " + avrg);

    }
}
