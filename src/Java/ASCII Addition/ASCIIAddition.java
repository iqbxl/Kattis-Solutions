import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class ASCIIAddition {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        char[][] zero = {"xxxxx".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "xxxxx".toCharArray()};

        char[][] one = {"....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray()};

        char[][] two = {"xxxxx".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "xxxxx".toCharArray(),
            "x....".toCharArray(),
            "x....".toCharArray(),
            "xxxxx".toCharArray()};

        char[][] three = {"xxxxx".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "xxxxx".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "xxxxx".toCharArray()};

        char[][] four = {"x...x".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "xxxxx".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray()};

        char[][] five = {"xxxxx".toCharArray(),
            "x....".toCharArray(),
            "x....".toCharArray(),
            "xxxxx".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "xxxxx".toCharArray()};

        char[][] six = {"xxxxx".toCharArray(),
            "x....".toCharArray(),
            "x....".toCharArray(),
            "xxxxx".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "xxxxx".toCharArray()};

        char[][] seven = {"xxxxx".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray()};

        char[][] eight = {"xxxxx".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "xxxxx".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "xxxxx".toCharArray()};

        char[][] nine = {"xxxxx".toCharArray(),
            "x...x".toCharArray(),
            "x...x".toCharArray(),
            "xxxxx".toCharArray(),
            "....x".toCharArray(),
            "....x".toCharArray(),
            "xxxxx".toCharArray()};

        char[][] plus = {".....".toCharArray(),
            "..x..".toCharArray(),
            "..x..".toCharArray(),
            "xxxxx".toCharArray(),
            "..x..".toCharArray(),
            "..x..".toCharArray(),
            ".....".toCharArray()};

        Map<char[][], String> map = new HashMap<>();
        map.put(zero, "0");
        map.put(one, "1");
        map.put(two, "2");
        map.put(three, "3");
        map.put(four, "4");
        map.put(five, "5");
        map.put(six, "6");
        map.put(seven, "7");
        map.put(eight, "8");
        map.put(nine, "9");
        map.put(plus, "+");

        String a = io.getLine();
        String b = io.getLine();
        String c = io.getLine();
        String d = io.getLine();
        String e = io.getLine();
        String f = io.getLine();
        String g = io.getLine();
        String msg = "";

        for (int i = 0; i < a.length(); i += 6) {
            char[][] arr = {a.substring(i, i + 5).toCharArray(),
                b.substring(i, i + 5).toCharArray(),
                c.substring(i, i + 5).toCharArray(),
                d.substring(i, i + 5).toCharArray(),
                e.substring(i, i + 5).toCharArray(),
                f.substring(i, i + 5).toCharArray(),
                g.substring(i, i + 5).toCharArray()};
            for (char[][] ch : map.keySet()) { // iterate through the set of all possible keys
                if (Arrays.deepEquals(arr, ch)) { // use Arrays.deepEquals for multi-dimensional arrays
                    msg += map.get(ch);
                }
            }
        }
        String[] s = msg.split("\\+"); // add the "\\" prefix, if not regex.PatternSyntaxException will be thrown
        String temp = Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + "";
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        for (int i = 0; i < temp.length(); i++) {
            for (char[][] ch : map.keySet()) {
                if (map.get(ch).equals(temp.substring(i, i + 1))) {
                    for (int j = 0; j < 5; j++) { 
                        a += ch[0][j];
                        b += ch[1][j];
                        c += ch[2][j];
                        d += ch[3][j];
                        e   += ch[4][j];
                        f += ch[5][j];
                        g += ch[6][j];
                    }
                    a += '.';
                    b += '.';
                    c += '.';
                    d += '.';
                    e += '.';
                    f += '.';
                    g += '.';
                }
            }
        }
        io.println(a.substring(0, a.length() - 1));
        io.println(b.substring(0, b.length() - 1));
        io.println(c.substring(0, c.length() - 1));
        io.println(d.substring(0, d.length() - 1));
        io.println(e.substring(0, e.length() - 1));
        io.println(f.substring(0, f.length() - 1));
        io.println(g.substring(0, g.length() - 1));
        io.flush();
    }
}