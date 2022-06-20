public class Cinema {
    public static void main(String[] args) {
        // Write your code here
        int rows = 7;
        int columns = 8;
        char[][] seating = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seating[i][j] = 'S';
            }
        }

        showSeating(seating);
    }

    private static void showSeating(char[][] seating) {
        System.out.println("Cinema:");
        System.out.println("  " + "1 " + "2 " + "3 " + "4 " + "5 " + "6 " + "7 " + "8");
        System.out.println("1 " + seating[0][0] + " " + seating[0][1] + " " + seating[0][2] + " " + seating[0][3] + " " + seating[0][4] + " " + seating[0][5] + " " + seating[0][6] + " " + seating[0][7]);
        System.out.println("2 " + seating[1][0] + " " + seating[1][1] + " " + seating[1][2] + " " + seating[1][3] + " " + seating[1][4] + " " + seating[1][5] + " " + seating[1][6] + " " + seating[1][7]);
        System.out.println("3 " + seating[2][0] + " " + seating[2][1] + " " + seating[2][2] + " " + seating[2][3] + " " + seating[2][4] + " " + seating[2][5] + " " + seating[2][6] + " " + seating[2][7]);
        System.out.println("4 " + seating[3][0] + " " + seating[3][1] + " " + seating[3][2] + " " + seating[3][3] + " " + seating[3][4] + " " + seating[3][5] + " " + seating[3][6] + " " + seating[3][7]);
        System.out.println("5 " + seating[4][0] + " " + seating[4][1] + " " + seating[4][2] + " " + seating[4][3] + " " + seating[4][4] + " " + seating[4][5] + " " + seating[4][6] + " " + seating[4][7]);
        System.out.println("6 " + seating[5][0] + " " + seating[5][1] + " " + seating[5][2] + " " + seating[5][3] + " " + seating[5][4] + " " + seating[5][5] + " " + seating[5][6] + " " + seating[5][7]);
        System.out.println("7 " + seating[6][0] + " " + seating[6][1] + " " + seating[6][2] + " " + seating[6][3] + " " + seating[6][4] + " " + seating[6][5] + " " + seating[6][6] + " " + seating[6][7]);
    }
}
