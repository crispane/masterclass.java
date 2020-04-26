public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int i = first / 2;
        while (i > 0) {
            if (first % i == 0 && second % i == 0)
                return i;
            i--;
        }
        return 1;
    }
}
