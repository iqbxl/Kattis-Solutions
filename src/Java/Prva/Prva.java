public class Prva {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt(), c = io.getInt();
        String[] row = new String[r];
        String smallest = "";
        for (int i = 0; i < r; i++) {
            row[i] = io.getLine();
            for (String s : row[i].split("#")) { //use split() method to separate into multiple strings
                if (s.length() > 1 && (s.compareTo(smallest) < 0 || smallest.equals(""))) {
                    smallest = s; 
                }
            }
        }
        char[] column = new char[r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                column[j] = row[j].charAt(i);
            }
            for (String s : new String(column).split("#")) {             //new String to convert char array
                if (s.length() > 1 && (s.compareTo(smallest) < 0)) { //2 main conditions must be met!!!
                    smallest = s;                                //use compareTo() to ascertain
                }                                                    //lexicographically smallest word
            }
        }
        io.print(smallest);
        io.flush();
    }
}