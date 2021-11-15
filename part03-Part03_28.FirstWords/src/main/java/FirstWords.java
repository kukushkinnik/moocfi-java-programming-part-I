
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String src = scanner.nextLine();

            if (src.equals("")) {
                break;
            }
            String[] arr = src.split(" ");

            System.out.println(arr[0]);
        }

    }
}
