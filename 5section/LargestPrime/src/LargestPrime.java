public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;

        int i = 2;
        while (number > 1) {
            if (number % i == 0)
                number /= i;
            else i++;
        }
        return i;
    }
}
