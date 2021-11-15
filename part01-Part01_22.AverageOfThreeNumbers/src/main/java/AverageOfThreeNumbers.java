
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int thirdNUmber = Integer.parseInt(scanner.nextLine());

        double avrg = (double)(firstNumber + secondNumber + thirdNUmber) / 3;
        System.out.println("The average is " + avrg);

    }
}
