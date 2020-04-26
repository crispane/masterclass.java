package crispane.udemy.java;

public class Main {
    public static void main(String[] args) {
        int count = 0; int sum = 0;
        for (int i = 1; i <1001; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                System.out.println(i);
                sum += i;
            }
            if (count > 4)
                break;
        }
        System.out.println("sum of first 5 numbers : " + sum);
    }
}
