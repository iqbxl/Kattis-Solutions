public class Prozor {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt();
        int s = io.getInt();
        int k = io.getInt();
        char[][] window = new char[r][s];
        for (int i = 0; i < r; i++) {
            String temp = io.getLine();
            for (int j = 0; j < s; j++) {
                window[i][j] = temp.charAt(j);
            }
        }

        int maxHit = 0;
        int bestCornerHitR = 0;
        int bestCornerHitS = 0;
        for (int i = 0; i < r - k + 1; i++) { // top left is the reference point
            for (int j = 0; j < s - k + 1; j++) {
                int hit = 0;
                for (int a = i + 1; a < i + k - 1; a++) { // since edges and corners dont count
                    for (int b = j + 1; b < j + k - 1; b++) {
                        if (window[a][b] == '*') {
                            hit++;
                        }
                    }
                }
                if (hit > maxHit) {
                    maxHit = hit;
                    bestCornerHitR = i;
                    bestCornerHitS = j;
                }
            }
        }

        window[bestCornerHitR][bestCornerHitS] = '+';
        window[bestCornerHitR][bestCornerHitS + k - 1] = '+';
        window[bestCornerHitR + k - 1][bestCornerHitS] = '+';
        window[bestCornerHitR + k - 1][bestCornerHitS + k - 1] = '+';
        
        for (int i = bestCornerHitS + 1; i < bestCornerHitS + k - 1; i++) {
            window[bestCornerHitR][i] = '-';
        }
        for (int i = bestCornerHitS + 1; i < bestCornerHitS + k - 1; i++) {
            window[bestCornerHitR + k - 1][i] = '-';
        }
        for (int i = bestCornerHitR + 1; i < bestCornerHitR + k - 1; i++) {
            window[i][bestCornerHitS] = '|';
        }
        for (int i = bestCornerHitR + 1; i < bestCornerHitR + k - 1; i++) {
            window[i][bestCornerHitS + k - 1] = '|';
        }
        io.println(maxHit);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                io.print(window[i][j]);
            }
            io.println();
        }
        io.flush();
    }
}