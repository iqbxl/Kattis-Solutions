public class Timebomb {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String line = io.getLine();
        int col = line.length();
        char[][] star = new char[5][col];
        for (int i = 0; i < col; i++) {
            star[0][i] = line.charAt(i);
        }
        for (int i = 1; i < 5; i++) {
            line = io.getLine();
            for (int j = 0; j < col; j++) {
                star[i][j] = line.charAt(j);
            }
        }
        
        String number = "";
        for (int i = 0; i < col; i += 4) {
            String lineA = "" + star[0][i] + star[0][i + 1] + star[0][i + 2];
            String lineB = "" + star[1][i] + star[1][i + 1] + star[1][i + 2];
            String lineC = "" + star[2][i] + star[2][i + 1] + star[2][i + 2];
            String lineD = "" + star[3][i] + star[3][i + 1] + star[3][i + 2];
            String lineE = "" + star[4][i] + star[4][i + 1] + star[4][i + 2];
            
            if (lineA.equals("***") &&
                    lineB.equals("* *") &&
                    lineC.equals("* *") &&
                    lineD.equals("* *") &&
                    lineE.equals("***")) {
                number += '0';
                    }
            
            else if (lineA.equals("  *") &&
                    lineB.equals("  *") &&
                    lineC.equals("  *") &&
                    lineD.equals("  *") &&
                    lineE.equals("  *")) {
                number += '1';
                    }

            else if (lineA.equals("***") &&
                    lineB.equals("  *") &&
                    lineC.equals("***") &&
                    lineD.equals("*  ") &&
                    lineE.equals("***")) {
                number += '2';
                    }

            else if (lineA.equals("***") &&
                    lineB.equals("  *") &&
                    lineC.equals("***") &&
                    lineD.equals("  *") &&
                    lineE.equals("***")) {
                number += '3';
                    }

            else if (lineA.equals("* *") &&
                    lineB.equals("* *") &&
                    lineC.equals("***") &&
                    lineD.equals("  *") &&
                    lineE.equals("  *")) {
                number += '4';
                    }

            else if (lineA.equals("***") &&
                    lineB.equals("*  ") &&
                    lineC.equals("***") &&
                    lineD.equals("  *") &&
                    lineE.equals("***")) {
                number += '5';
                    }

            else if (lineA.equals("***") &&
                    lineB.equals("*  ") &&
                    lineC.equals("***") &&
                    lineD.equals("* *") &&
                    lineE.equals("***")) {
                number += '6';
                    }

            else if (lineA.equals("***") &&
                    lineB.equals("  *") &&
                    lineC.equals("  *") &&
                    lineD.equals("  *") &&
                    lineE.equals("  *")) {
                number += '7';
                    }

            else if (lineA.equals("***") &&
                    lineB.equals("* *") &&
                    lineC.equals("***") &&
                    lineD.equals("* *") &&
                    lineE.equals("***")) {
                number += '8';
                    }

            else if (lineA.equals("***") &&
                    lineB.equals("* *") &&
                    lineC.equals("***") &&
                    lineD.equals("  *") &&
                    lineE.equals("***")) {
                number += '9';
                    }
            else {
                number += '!';
            }
        }

        if (number.contains("!")) {
            io.print("BOOM!!");
        } else {
            if (Integer.parseInt(number) % 6 == 0) { // handles leading zeros
                io.print("BEER!!");
            } else {
                io.print("BOOM!!");
            }
        }
        io.flush();
    }
}