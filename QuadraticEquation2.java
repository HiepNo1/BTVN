import java.util.Scanner;

public class QuadraticEquation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The quadratic equation 2 ax^2 + bx + c = 0");
        try {
            System.out.print("Input a = ");
            double inputA = scanner.nextDouble();
            System.out.println();
            System.out.print("Input b = ");
            double inputB = scanner.nextDouble();
            System.out.println();
            System.out.print("Input c = ");
            double inputC = scanner.nextDouble();
            System.out.println();
            if (inputA == 0) {
                if (inputB == 0 && inputC == 0) {
                    System.out.println("The equation has infinitely many solutions");
                } else if (inputB == 0 && inputC != 0) {
                    System.out.println("The equation has no solution");
                } else {
                    System.out.println("The equation that has a solution is : " + (-inputC / inputB));
                }
            } else {
                double delta = inputB * inputB - 4 * inputA * inputC;
                if (delta < 0) {
                    System.out.println("The equation has no solution ");
                } else if (delta == 0) {
                    System.out.println("The equation with a double solution is x = " + (-inputB / (2 * inputA)));
                } else {
                    double can = Math.sqrt(delta);
                    System.out.println("The equation has 2 distinct solutions : ");
                    System.out.print("x1 = " + (-inputB - can) / (2 * inputA));
                    System.out.println();
                    System.out.println("x2 = " + (-inputB + can) / (2 * inputA));
                }
            }
        } catch (Exception e) {
            System.out.println("You entered the wrong format !!!");
        }
    }
}
