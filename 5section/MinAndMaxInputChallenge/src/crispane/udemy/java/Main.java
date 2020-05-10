package crispane.udemy.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number " + order + " :");

            if (scanner.hasNextInt()) {
                int scan = scanner.nextInt();
                if (order == 1) {
                    min = scan;
                    max = scan;
                    counter++;
                } else {
                    min = (min < scan) ? min : scan;
                    max = (max > scan) ? max : scan;
                    counter++;
                    if (counter == 10)
                        break;
                }

            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The min of input numbers is: " + min);
        System.out.println("The max of input numbers is: " + max);


    }
}
