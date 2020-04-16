package crispane.udemy.java;

public class Main {

    public static void main(String[] args) {
        double firstVar= 20.00;
        double secondVar = 80.00;
        double result = (firstVar + secondVar) * 100;
        double remain = result % 40.00;
        boolean bool = remain == 0;

        if (!bool)
            System.out.println("Got some remainder.");
    }
}
