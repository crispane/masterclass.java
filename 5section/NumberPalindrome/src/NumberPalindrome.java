import static java.lang.Math.abs;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 10 && number > -10)
            return false;

        int initial = abs(number);
        int palindrome = initial % 10;
        initial /= 10;
        while (initial > 0) {
            palindrome = (palindrome * 10) + (initial % 10);
            initial /= 10;
        }

        if (abs(number)== palindrome)
            return true;
        else return false;

    }
}

