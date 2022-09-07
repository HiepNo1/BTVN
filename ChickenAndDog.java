import java.util.Scanner;

public class ChickenAndDog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The problem of finding the number of chickens and the number of dogs.");
        int inputTotal = 0, inputTotalPins = 0;
        try {
            System.out.print("Enter the total number of chickens and dogs : ");
            inputTotal = scanner.nextInt();
            System.out.println();
            System.out.print("Enter the total number of pins : ");
            inputTotalPins = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input !!!");
        }
        System.out.println();
        int chickenAmount = 0, dogAmount = 0;
        if (inputTotal < 0 || inputTotalPins < 0 || inputTotalPins % 2 == 1 || (inputTotalPins - 2 * inputTotal) % 2 == 1) {
            System.out.println("Invalid data !!!");
        } else {
            dogAmount = (inputTotalPins - 2 * inputTotal) / 2;
            chickenAmount = inputTotal - dogAmount;
            if (chickenAmount < 0 || dogAmount < 0) {
                System.out.println("Invalid data !!!");
            } else {
                System.out.println("Quantity of chickens = " + chickenAmount);
                System.out.println("Quantity of dogs = " + dogAmount);
            }
        }

    }
}
