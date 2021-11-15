
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if(str.equals("")) {
                break;
            }

            String[] arr = str.split(" ");
            String word = "";

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains("av")) {
                    word =  arr[i];
                    System.out.println(word);
                }

            }

        }


    }
}
