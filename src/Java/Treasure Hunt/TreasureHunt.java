public class TreasureHunt {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int R = io.getInt(), C = io.getInt();
        char[][] A = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = io.getWord();
            for (int j = 0; j < C; j++) {
                A[i][j] = line.charAt(j);
            }
        }
        int Rv = 0, Cv = 0, res = 0;
        for (int i = 0; i < R * C; i++) {
            if (Rv < 0 || Cv < 0 || Rv > R - 1 || Cv > C - 1) {
                io.println("Out");
                break;
            }
            if (A[Rv][Cv] == 'T') {
                io.println(res);
                break;
            }
            if (A[Rv][Cv] == 'X') {
                io.println("Lost");
                break;
            }
            char letter = A[Rv][Cv];
            A[Rv][Cv] = 'X';
            if (letter == 'S') {
                Rv++;
            } else if (letter == 'E') {
                Cv++;
            } else if (letter == 'N') {
                Rv--;
            } else if (letter == 'W') {
                Cv--;
            }
            res++;
        }
        io.flush();
    }
}