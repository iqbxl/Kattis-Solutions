public class Skener {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int R = io.getInt(), C = io.getInt(), Zr = io.getInt(), Zc = io.getInt();
        String array[][] = new String[R][C]; //create 3 Dimensional array
        for (int i = 0; i < R; i++) {
            String row = io.getWord(); //for loop to get word for each row
            for (int j = 0; j < C; j++) {
                array[i][j] = row.substring(j, j + 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < Zr; y++) {
                for (int j = 0; j < array[0].length; j++) {
                    for (int x = 0; x < Zc; x++) {
                        io.print(array[i][j]);
                    }
                }
                io.println();
            }
        }
        io.flush();
    }
}