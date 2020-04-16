package crispane.udemy.java;

public class Main {

    public static void main(String[] args) {

        int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score is " + highscore);
        highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score is " + highscore);

        highscore = calculateHighscorePosition(1500);
        displayHighscorePosition("Jack", highscore);
        highscore = calculateHighscorePosition(900);
        displayHighscorePosition("Nico", highscore);
        highscore = calculateHighscorePosition(400);
        displayHighscorePosition("Bob", highscore);
        highscore = calculateHighscorePosition(90);
        displayHighscorePosition("Mary", highscore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighscorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighscorePosition(int score) {
//        if (score >= 1000)
//            return 1;
//        else if (score >= 500)
//            return 2;
//        else if (score >= 100)
//            return 3;
//
//        return 4;

        int position = 4; //assuming 4th position will be returned

        if (score >= 1000)
            position = 1;
        else if (score >= 500)
            position = 2;
        else if (score >= 100)
            position = 3;

        return position;
    }
}
