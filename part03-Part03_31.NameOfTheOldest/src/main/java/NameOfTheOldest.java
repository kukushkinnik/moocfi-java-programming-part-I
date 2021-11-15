
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;

        while(true) {
            String str = scanner.nextLine();

            if(str.equals("")) {
                break;
            }


            String[] arr = str.split(",");

            int ag = Integer.parseInt(arr[1]);


            if(age < ag) {
                age = ag;
                name = arr[0];
            }

        }
        System.out.println("Name of the oldest: " + name);


    }
}
