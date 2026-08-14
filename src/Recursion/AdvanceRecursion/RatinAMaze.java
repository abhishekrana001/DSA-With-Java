package Recursion.AdvanceRecursion;

public class RatinAMaze {
    public static void solveMaze(
            int[][] maze,
            int row,
            int col,
            String path,
            boolean[][] visited) {

        int n = maze.length;

        if (row < 0 || col < 0 ||
                row >= n || col >= n ||
                maze[row][col] == 0 ||
                visited[row][col]) {
            return;
        }

        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            return;
        }

        visited[row][col] = true;

        solveMaze(
                maze,
                row + 1,
                col,
                path + "D",
                visited
        );

        solveMaze(
                maze,
                row,
                col + 1,
                path + "R",
                visited
        );

        solveMaze(
                maze,
                row - 1,
                col,
                path + "U",
                visited
        );

        solveMaze(
                maze,
                row,
                col - 1,
                path + "L",
                visited
        );

        visited[row][col] = false;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int n = maze.length;

        boolean[][] visited = new boolean[n][n];

        solveMaze(maze, 0, 0, "", visited);
    }
}
