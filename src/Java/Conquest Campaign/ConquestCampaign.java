public class ConquestCampaign {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt(), c = io.getInt(), n = io.getInt();
        int[][] grid = new int[r][c];
        for (int i = 0; i < n; i++) {
            int x = io.getInt() - 1, y = io.getInt() - 1;
            grid[x][y] = 1; // the rest is initialised to 0 by default
        }
        int count = 1;
        while (true) {
            boolean updated = false;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (grid[i][j] == count) {
                        if (i + 1 < grid.length && grid[i + 1][j] == 0) { // 2 conditions to check: if the index of
                            grid[i + 1][j] = count + 1;                   // the neighbour is out of bounds and
                            updated = true;                               // whether the neighbour has been occupied    
                        }
                        if (i - 1 >= 0 && grid[i - 1][j] == 0) {
                            grid[i - 1][j] = count + 1;
                            updated = true;
                        }
                        if (j + 1 < grid[0].length && grid[i][j + 1] == 0) {
                            grid[i][j + 1] = count + 1;
                            updated = true;
                        }
                        if (j - 1 >= 0 && grid[i][j - 1] == 0) {
                            grid[i][j - 1] = count + 1;
                            updated = true;
                        }
                    }
                }
            }
            if (updated) {
                count++; // different day has different count (1, 2, 3....)
            } else {
                break;
            }
        }
        io.print(count);
        io.flush();
    }
}