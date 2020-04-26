public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;

        int first = number % 10, last = number % 10;

        while (number > 9) {
            number = number / 10;
            first = number;
        }
        return first + last;
    }
}
