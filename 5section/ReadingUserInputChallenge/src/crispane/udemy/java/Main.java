package crispane.udemy.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + " :");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }
            else
                System.out.println("Invalid Number");
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum of input numbers is: " + sum);
    }

}