class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int row = 1;
            int col = 1;

            while (row <= number) {
                while (col <= number) {
                    if (row == 1 || row == number) {
                        System.out.print("*");
                    } else if (col == 1 || col == number) {
                        System.out.print("*");
                    } else if (row == col) {
                        System.out.print("*");
                    } else if (col == number - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    col++;
                }
                row++;
                System.out.println("");
                col = 1;
            }
        }
    }
}