import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-zero integer: ");
        int inputNumber = 0;
        try {
            inputNumber = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong format !!!");
        }
        while (inputNumber == 0) {
            System.out.println("Must enter integers other than 0");
            System.out.print("Retype : ");
            inputNumber = scanner.nextInt();
        }
        if (inputNumber > 0) {
            System.out.println(inputNumber + " is a positive integer!");
        } else if (inputNumber < 0) {
            System.out.println(inputNumber + " is a negative integer!");
        }
    }
}
