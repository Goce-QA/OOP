public class Main {
    public static void main(String[] args) {
        // Initialize a 10x10 grid with some values
        int[][] grid = new int[10][10];
        int value = 0;

        // Fill the grid with values from 1 to 100
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = value++;
            }
        }

        // Print the grid
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(String.valueOf(grid[i][j]));
            }
            System.out.println();
        }
    }
}