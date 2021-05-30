public class Peg {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        char[][] board = new char[7][7];
        for (int i = 0; i < 2; i++) {
            String word = io.getWord();
            int k = 0;
            for (int j = 2; j < 5; j++) {
                board[i][j] = word.charAt(k++);
            }
        }
        for (int i = 2; i < 5; i++) {
            String word = io.getWord();
            for (int j = 0; j < 7; j++) {
                board[i][j] = word.charAt(j);
            }
        }
        for (int i = 5; i < 7; i++) {
            String word = io.getWord();
            int k = 0;
            for (int j = 2; j < 5; j++) {
                board[i][j] = word.charAt(k++);
            }
        }
        int nMoves = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == '.') {
                    if (j > 1 && board[i][j - 1] == 'o' && board[i][j - 2] == 'o') {
                        nMoves++;
                    }
                    if (j < 5 && board[i][j + 1] == 'o' && board[i][j + 2] == 'o') {
                        nMoves++;
                    }
                    if (i > 1 && board[i - 1][j] == 'o' && board[i - 2][j] == 'o') {
                        nMoves++;
                    }
                    if (i < 5 && board[i + 1][j] == 'o' && board[i + 2][j] == 'o') {
                        nMoves++;
                    }
                }
            }
        }
        io.print(nMoves);
        io.flush();
    }
}