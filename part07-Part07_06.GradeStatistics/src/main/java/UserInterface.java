import java.util.Scanner;

public class UserInterface {
    private GradeSystem system;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.system = new GradeSystem();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.parseInt(this.scanner.nextLine());

            if (points == -1) {
                break;
            }

            if (points > 0 && points <= 100) {
                system.addPoints(points);
            }
        }
        system.pointsToGrades();

        System.out.println("Point average (all): " + system.avrgOfAllPoints());

        if (system.sumOfPassingPoints() == 0) {
            System.out.println("Point average (passing):-");
        } else {
            System.out.println("Point average (passing): " + system.avrgOfPassingPoints());
        }

        System.out.println("Pass percentage: " + system.percentageOfPassing());
        System.out.println("Grade distribution: " + "\n" +
                "5: " + system.gradesToStars(5) + "\n" +
                "4: " + system.gradesToStars(4) + "\n" +
                "3: " + system.gradesToStars(3) + "\n" +
                "2: " + system.gradesToStars(2) + "\n" +
                "1: " + system.gradesToStars(1) + "\n" +
                "0: " + system.gradesToStars(0));
    }


}

