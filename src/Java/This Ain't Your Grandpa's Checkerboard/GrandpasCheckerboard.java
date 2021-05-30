public class GrandpasCheckerboard {
    public static char[][] transposeMatrix(char[][] a) { //only works for a square matrix --> instead of going thru
        int n = a.length;                            //entire array, just iterae thru the diagonally bottom  
        for (int i = 0; i < n; i++) {                //half of the 2D array & swap the values with the 
            for (int j = 0; j < i; j++) {        //corresponding indices
                char temp = a[i][j];         
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        char[][] array = new char[n][n];
        int rowtotalB = 0;
        for (int i = 0; i < n; i++) {
            String row = io.getWord();
            int rowsumB = 0;
            for (int j = 0; j < n; j++) {
                array[i][j] = row.charAt(j);
                if (row.charAt(j) == 'B') {
                    rowsumB += 1;
                }
            }
            if (rowsumB == n / 2 && !row.contains("WWW") && !row.contains("BBB")) {
                rowtotalB += rowsumB; //if total = n * n / 2, then true
            }
        } 
        transposeMatrix(array);
        int columntotalB = 0;
        for (int i = 0; i < n; i++) {
            int columnsumB = 0;
            String out = "";
            for (int j = 0; j < n; j++) {
                out += array[i][j];
                if (array[i][j] == 'B') {
                    columnsumB += 1;
                }
            }
            if (columnsumB == n / 2 && !out.contains("WWW") && !out.contains("BBB")) {
                columntotalB += columnsumB; //if total = n * n / 2, then true
            }
        }
        if (rowtotalB == n * n / 2 && columntotalB == n * n / 2) {
            io.print(1);
        } else {
            io.print(0);
        }
        io.flush();
    }
}