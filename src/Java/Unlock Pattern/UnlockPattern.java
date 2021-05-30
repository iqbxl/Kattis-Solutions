public class UnlockPattern {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int[][] digits = new int[3][3];
        int curR = 0, curC = 0; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                digits[i][j] = io.getInt(); //fill in 2d array with the given numbers
                if (digits[i][j] == 1) { //start with integer 1 and record its position
                    curR = i;
                    curC = j;
                }
            }
        }
        double length = 0; 
        for (int a = 2; a <= 9; a++) { //total of 8 iterations, max int is 9
            int rowDif = 0, colDif = 0;
            outerloop: //to break out of outer loop
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (digits[i][j] == a) { //start with integer 2 to compare with 1
                        rowDif = Math.abs(curR - i); 
                        colDif = Math.abs(curC - j); 
                        curR = i; //update current index of row and column
                        curC = j;
                        break outerloop;
                    }
                }
            }
            if (rowDif == 0 && colDif == 1 || rowDif == 1 && colDif == 0) { //total of 5 cases,
                length += 1;                                            //update length accordingly
            } else if (rowDif == 0 && colDif == 2 || rowDif == 2 && colDif == 0) {
                length += 2;
            } else if (rowDif == 1 && colDif == 1) {
                length += Math.sqrt(2);
            } else if (rowDif == 1 && colDif == 2 || rowDif == 2 && colDif == 1) {
                length += Math.sqrt(5);
            } else if (rowDif == 2 && colDif == 2) {
                length += Math.sqrt(8);
            }
        }
        io.print(length);
        io.flush();
    }
}