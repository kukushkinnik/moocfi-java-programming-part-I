import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Name:");
            String title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Duration:");
            int duration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(title, duration));
        }

        System.out.println("Program's maximum duration?");
        int time = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (time >= program.getDuration() && time > 0) {
                System.out.print(program);
            }
        }

    }
}
