
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        while(true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            String[] arr = str.split(",");
            int ag = Integer.parseInt(arr[1]);

            if (age < ag) {
                age = ag;
            }
        }
        System.out.println("Age of the oldest: " + age);


    }
}
