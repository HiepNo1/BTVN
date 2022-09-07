import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        System.out.print("Enter the student's GPA : ");
        Scanner scanner = new Scanner(System.in);

        try {
            Double inputGPA = scanner.nextDouble();
            while (inputGPA < 0 || inputGPA > 10) {
                System.out.println("GPA should be between 0 and 10 !!!");
                System.out.print("Retype : ");
                inputGPA = scanner.nextDouble();
            }
            if (inputGPA >= 8 && inputGPA <= 10) {
                System.out.println("Graded Excellent");
            }
            if (inputGPA >= 6.5 && inputGPA < 8) {
                System.out.println("Graded Fairly");
            }
            if (inputGPA >= 5 && inputGPA < 6.5) {
                System.out.println("Graded Average");
            }
            if (inputGPA >= 0 && inputGPA < 5) {
                System.out.println("Graded Weak");
            }
        } catch (Exception e) {
            System.out.println("Wrong format!!!");
        }

    }
}
