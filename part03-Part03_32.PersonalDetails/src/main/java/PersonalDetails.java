
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avrg = 0;
        int counter = 0;
        int sum = 0;
        int lengthOfName = 0;
        String name = "";

        while(true) {
            String str = scanner.nextLine();

            if(str.equals("")) {
                break;
            }

            String[] arr = str.split(",");
            int year = Integer.parseInt(arr[1]);
            sum += year;
            counter++;

            for (int i = 0; i < arr.length; i++) {
                if (lengthOfName < arr[i].length()) {
                    lengthOfName = arr[i].length();
                    name = arr[i];
                }
            }

        }
        avrg = (double) sum / counter;

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avrg);


    }
}
