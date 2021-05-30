public class ShebasAmoebas {

    private static char[][] grid;
    private static boolean[][] visited;
    private static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1}; // offset in the x direction
    private static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1}; // offset in the y direction

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int m = io.getInt();
        int n = io.getInt();
        grid = new char[m][n];
        visited = new boolean[m][n]; // auto-initialize each entry to false
        for (int i = 0; i < m; i++) {
            String line = io.getLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '#' && !visited[i][j]) {
                    occupy(i, j);
                    count++;
                }
            }
        }
        io.print(count);
        io.flush();
    }

    private static void occupy(int r, int c) { // recursive function to fill
        if (visited[r][c]) {
            return;
        }
        visited[r][c] = true; // mark visited position as true
        for (int i = 0; i < 8; i++) {
            if (withinRange(r + dy[i],  c + dx[i]) && grid[r + dy[i]][c + dx[i]] == '#') {
                occupy(r + dy[i], c + dx[i]);
            }
        }
    }

    private static boolean withinRange(int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }
}