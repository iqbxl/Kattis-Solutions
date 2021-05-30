import java.util.Arrays;

public class Oktalni {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String[] groups = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String binary = io.getWord();
        int lenDivThree = binary.length() % 3;
        if (lenDivThree == 1) {
            binary = "00" + binary;
        } else if (lenDivThree == 2) {
            binary = "0" + binary;
        }
        String res = "";
        for (int i = 0; i < binary.length(); i += 3) {
            res += Arrays.asList(groups).indexOf(binary.substring(i, i + 3));
        }
        io.print(res);
        io.flush();
    }
}

// cannot do Integer.toOctalString(Integer.parseInt(io.getWord(), 2)) for
// integer size > 31