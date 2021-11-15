
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics stat = new Statistics();
        Statistics statTwo = new Statistics();
        Statistics statThree = new Statistics();

        while (true) {
            System.out.println("Enter numbers:");
            int number = Integer.parseInt(scanner.nextLine());

            if(number == -1) {
                break;
            }

            if (number % 2 == 0) {
                statTwo.addNumber(number);
            } else {
                statThree.addNumber(number);
            }


            stat.addNumber(number);

        }

        System.out.println("Sum: " + stat.sum());
        System.out.println("Sum of even numbers: " + statTwo.sum());
        System.out.println("Sum of odd numbers: " + statThree.sum());
    }
}
