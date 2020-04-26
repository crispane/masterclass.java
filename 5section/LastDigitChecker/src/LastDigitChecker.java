public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c))

            return a % 10 == b % 10 ||
                    a % 10 == c % 10 ||
                    c % 10 == b % 10;

        else return false;
    }

    public static boolean isValid(int number) {
        return (9 < number && number < 1001);
    }
}

