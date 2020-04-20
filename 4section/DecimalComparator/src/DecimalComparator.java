public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        if (Math.abs(a * 1000 - b * 1000) < 1) {
            return true;
        } else
            return false;
    }
}
