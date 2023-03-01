import java.util.Scanner;

public class ColorGrid {
    private static final int BLUE = 1;
    private static final int RED = 2;
    private static final int GREEN = 3;

    private int[][] grid;
    private int rows;
    private int columns;

    public ColorGrid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        grid = new int[rows][columns];
    }

    public void fillGrid(int color, int x, int y) {
        if (x < 0 || x >= rows || y < 0 || y >= columns) {
            return;
        }
        if (grid[x][y] == 0) {
            grid[x][y] = color;
            fillGrid(nextColor(color), x - 1, y);
            fillGrid(nextColor(color), x + 1, y);
            fillGrid(nextColor(color), x, y - 1);
            fillGrid(nextColor(color), x, y + 1);
        }
    }

    private int nextColor(int color) {
        switch (color) {
            case BLUE:
                return RED;
            case RED:
                return GREEN;
            case GREEN:
                return BLUE;
            default:
                return BLUE;
        }
    }

    public void displayGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int columns = sc.nextInt();
            System.out.print("Enter the starting cell (x y): ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            ColorGrid colorGrid = new ColorGrid(rows, columns);
            colorGrid.fillGrid(BLUE, x, y);
            colorGrid.displayGrid();
        }
    }
}

