import java.util.ArrayList;
import java.util.Scanner;

public class Studentgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        System.out.println("Enter grades for students. Type '-1' to stop.");
        
        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            scanner.close();
            
            if (grade == -1) {
                break;
            }
            
            grades.add(grade);
        }
        
        double total = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        
        for (double grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        
        double average = total / grades.size();
        
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}