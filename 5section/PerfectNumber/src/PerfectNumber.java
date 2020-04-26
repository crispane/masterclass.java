public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;

        int i = 1;
        int perfect = 0;
        while (i <= number / 2) {
            if (number % i == 0)
                perfect += i;
            i++;
        }
        if (perfect == number)
            return true;

        return false;
    }
}



