public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        if (a > 12 && a < 20)
            return true;
        else if (b > 12 && b < 20)
            return true;
        else if (c > 12 && c < 20)
            return true;

        return false;
    }

    public static boolean isTeen(int a) {
        if (a > 12 && a < 20)
            return true;

        return false;
    }
}
