import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        char[][] seating = new char[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                seating[i][j] = 'S';
            }
        }

        benefitObtained(rows, seats);
        showSeating(seating);
    }

    private static void showSeating(char[][] seating) {
        System.out.println("Cinema:");

    }

    private static void benefitObtained(int rows, int columns) {
        int seating = rows * columns;
        int benefit;
        if (seating <= 60) {
            benefit = seating * 10;
        } else {
            int frontRows = (rows / 2);
            int rearRows = (rows - frontRows);
            benefit = (frontRows * 10 + rearRows * 8) * columns;
        }
        System.out.println("Total income:");
        System.out.println("$" + benefit);
    }
}
