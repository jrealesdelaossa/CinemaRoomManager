import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        rows += 1;
        seats += 1;
        char[][] seating = new char[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (i == 0 && j == 0) {
                    seating[i][j] = ' ';
                } else if (j == 0) {
                    seating[i][j] = (char)(i + '0');
                } else if (i == 0) {
                    seating[i][j] = (char)(j + '0');
                } else {
                    seating[i][j] = 'S';
                }
            }
        }

        // benefitObtained(rows - 1, seats - 1);
        showSeating(seating);
    }

    private static void showSeating(char[][] seating) {
        System.out.println("Cinema:");
        for (char[] chars : seating) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
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

    // hacer el metodo para el precio del tiquete
    //private static void ticketPrice
}
