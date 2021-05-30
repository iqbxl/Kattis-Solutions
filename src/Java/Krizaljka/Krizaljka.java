public class Krizaljka {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String a = io.getWord(), b = io.getWord();
        char[][] grid = new char[b.length()][a.length()];
        int row = 0;
        int col = 0;
        boolean cont = true;
        for (int i = 0; i < a.length() && cont; i++) { // dont use labels, do this instead
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    row = j;
                    col = i;
                    cont = false;
                    break;
                }
            }
        }
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (i == row) {
                    grid[i][j] = a.charAt(j);
                } else if (j == col) {
                    grid[i][j] = b.charAt(i);
                } else {
                    grid[i][j] = '.';
                }
            }
        }
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                io.print(grid[i][j]);
            }
            io.println();
        }
        io.flush();
    }
}