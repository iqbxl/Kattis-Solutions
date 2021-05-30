import java.util.Arrays;

public class Mia {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int a = io.getInt();
            int b = io.getInt();
            int c = io.getInt();
            int d = io.getInt();
            if ((a == 0) && (b == 0) && (c == 0) && (d == 0)) break;
            int[] arrX = {a, b};
            int[] arrY = {c, d};
            Arrays.sort(arrX);
            Arrays.sort(arrY);
            if (Arrays.equals(arrX, arrY)) {
                io.println("Tie.");
            } else if (arrX[0] == 1 && arrX[1] == 2) {
                io.println("Player 1 wins.");
            } else if (arrY[0] == 1 && arrY[1] == 2) {
                io.println("Player 2 wins.");
            } else if (arrX[0] == arrX[1] && arrY[0] == arrY[1]) {
                io.println(arrX[0] > arrY[0] ? "Player 1 wins." : "Player 2 wins.");
            } else if (arrX[0] == arrX[1]) {
                io.println("Player 1 wins.");
            } else if (arrY[0] == arrY[1]) {
                io.println("Player 2 wins.");
            } else if (arrX[1] > arrY[1]) {
                io.println("Player 1 wins.");
            } else if (arrX[1] < arrY[1]) {
                io.println("Player 2 wins.");
            } else {
                if (arrX[0] > arrY[0]) {
                    io.println("Player 1 wins.");
                } else {
                    io.println("Player 2 wins.");
                }
            }
        }
        io.flush();
    }
}