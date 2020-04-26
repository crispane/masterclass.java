public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        int i = 1;
        while (i <= number / 2) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
        System.out.println(number);
    }
}

