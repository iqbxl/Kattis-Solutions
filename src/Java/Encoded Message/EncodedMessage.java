public class EncodedMessage {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int k = 0; k < n; k++) {
            String encoded = io.getWord();
            int rows = (int)Math.sqrt(encoded.length());
            char[][] letters = new char[rows][rows];
            int count = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    letters[i][j] = encoded.charAt(count);
                    count += 1;
                }
            }
            String res = "";
            for (int i = rows - 1; i >= 0; i--) {
                for (int j = 0; j < rows; j++) {
                    res += letters[j][i];
                }
            }
            io.println(res);
        }
        io.flush();
    }
}