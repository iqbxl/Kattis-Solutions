import java.io.BufferedReader; // BufferedReader is from java.io package while Scanner is from java.util.package
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class T9Spelling {                                            // Can use Kattio for this qn but must read line
    public static void main(String[] args) throws Exception { // BufferedReader forces you to handle exceptions
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());              // BufferedReader reads line by line and does not
        HashMap<String, String> map = new HashMap<>();        // need to parse the data unlike Scanner
        map.put("a", "2");
        map.put("b", "22");
        map.put("c", "222");
        map.put("d", "3");
        map.put("e", "33");
        map.put("f", "333");
        map.put("g", "4");
        map.put("h", "44");
        map.put("i", "444");
        map.put("j", "5");
        map.put("k", "55");
        map.put("l", "555");
        map.put("m", "6");
        map.put("n", "66");
        map.put("o", "666");
        map.put("p", "7");
        map.put("q", "77");
        map.put("r", "777");
        map.put("s", "7777");
        map.put("t", "8");
        map.put("u", "88");
        map.put("v", "888");
        map.put("w", "9");
        map.put("x", "99");
        map.put("y", "999");
        map.put("z", "9999");
        map.put(" ", "0"); 
        for (int i = 0; i < n; i++) {
            String prev = " "; // stores the previous character
            String msg = in.readLine();
            out.print("Case #" + (i + 1) + ": ");
            for (int j = 0; j < msg.length(); j++) {
                String current = msg.substring(j, j + 1);
                if (current.equals(prev) || map.get(current).contains(map.get(prev).substring(0, 1))) {
                    out.print(" " + map.get(current));
                } else {
                    out.print(map.get(current));
                }
                prev = current;
            }
            if (i != n - 1) out.println(); // if not at last iteration, print out new line
        }
        out.flush();
    }
}