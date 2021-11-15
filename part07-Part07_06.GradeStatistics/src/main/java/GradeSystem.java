import java.util.ArrayList;

public class GradeSystem {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private static int counter;

    public GradeSystem() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        counter = 0;
    }

    public void addPoints(int points) {
        this.points.add(points);

    }

    public double avrgOfAllPoints() {
        int sum = 0;
        for (Integer point : points) {
            sum += point;
        }
        return (double) sum / points.size();
    }

    public double avrgOfPassingPoints() {
        int sum = 0;

        for (Integer point : points) {
            if (point >= 50 && point <= 100) {
                sum += point;
                increaseCounter();
            }
        }
        return (double) sum / counter;
    }

    public void increaseCounter() {
        counter++;
    }

    public int sumOfPassingPoints() {
        int sum = 0;
        for (Integer point : points) {
            if(point >= 50 && point <= 100) {
                sum += point;
            }
        }
        return sum;
    }

    public double percentageOfPassing() {
        return 100.0 * counter / points.size();
    }

    public void pointsToGrades() {
        int grade;

        for (Integer point : points) {
            if (point < 50) {
                grade = 0;
                grades.add(grade);
            } else if (point < 60) {
                grade = 1;
                grades.add(grade);
            } else if (point < 70) {
                grade = 2;
                grades.add(grade);
            } else if (point < 80) {
                grade = 3;
                grades.add(grade);
            } else if (point < 90) {
                grade = 4;
                grades.add(grade);
            } else if (point >= 90) {
                grade = 5;
                grades.add(grade);
            }
        }
    }

    public String gradesToStars(int gradeQuery){
        String stars = "";
        for(Integer grade:grades){
            if(grade == gradeQuery){
                stars += "*";
            }
        }
        return stars;
    }



}
