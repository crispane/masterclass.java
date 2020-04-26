public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int digit = reverse(number);
        if (digit == 0) {
            System.out.println("Zero ");
            return;
        }

        int diff = getDigitCount(number) - getDigitCount(digit);

        while (digit > 0) {

            switch (digit % 10) {
                case 0:
                    System.out.printf("Zero ");
                    break;
                case 1:
                    System.out.printf("One ");
                    break;
                case 2:
                    System.out.printf("Two ");
                    break;
                case 3:
                    System.out.printf("Three ");
                    break;
                case 4:
                    System.out.printf("Four ");
                    break;
                case 5:
                    System.out.printf("Five ");
                    break;
                case 6:
                    System.out.printf("Six ");
                    break;
                case 7:
                    System.out.printf("Seven ");
                    break;
                case 8:
                    System.out.printf("Eight ");
                    break;
                case 9:
                    System.out.printf("Nine ");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            digit /= 10;
        }

        if (diff > 0)
            for (int i = 0; i < diff; i++)
                System.out.printf("Zero ");
    }

    public static int reverse(int number) {
        int temp = 0;
        while (number != 0) {
            temp = temp * 10 + (number % 10);
            number = number / 10;
        }
        return temp;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;

        if (number == 0)
            return 1;

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
