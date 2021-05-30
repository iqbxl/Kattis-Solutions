public class Cudoviste {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt();
        int c = io.getInt();
        String[][] spaces = new String[r][c];
        for (int i = 0; i < r; i++) {
            String temp = io.getLine();
            for (int j = 0; j < c; j++) {
                spaces[i][j] = temp.substring(j, j + 1);
            }
        }
        int zeroCar = 0;
        int oneCar = 0;
        int twoCar = 0;
        int threeCar = 0;
        int fourCar = 0;

        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (canPark(spaces, i, j)) {
                    int temp = carCrush(spaces, i, j);
                    if (temp == 0) {
                        zeroCar++;
                    } else if (temp == 1) {
                        oneCar++;
                    } else if (temp == 2) {
                        twoCar++;
                    } else if (temp == 3) {
                        threeCar++;
                    } else if (temp == 4) {
                        fourCar++;
                    }
                }
            }
        }
        io.println(zeroCar);
        io.println(oneCar);
        io.println(twoCar);
        io.println(threeCar);
        io.println(fourCar);
        io.flush();
    }

    public static boolean canPark(String[][] arr, int i, int j) {
        // i and j represent the top left corner of a possible space
        if (arr[i][j].equals("#")) {
            return false;
        } else if (arr[i][j + 1].equals("#")) {
            return false;
        } else if (arr[i + 1][j].equals("#")) {
            return false;
        } else if (arr[i + 1][j + 1].equals("#")) {
            return false;
        }
        return true;
    }

    public static int carCrush(String[][] arr, int i, int j) {
        int count = 0;
        if (arr[i][j].equals("X")) {
            count++;
        }
        if (arr[i][j + 1].equals("X")) {
            count++;
        }
        if (arr[i + 1][j].equals("X")) {
            count++;
        }
        if (arr[i + 1][j + 1].equals("X")) {
            count++;
        }
        return count;
    }
}