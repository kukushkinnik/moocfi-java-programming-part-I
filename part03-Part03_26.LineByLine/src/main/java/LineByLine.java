
import java.util.Objects;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }
            String[] arr = str.split(" ");

            for (String s : arr) {
                System.out.println(s);
            }
        }


    }
}
