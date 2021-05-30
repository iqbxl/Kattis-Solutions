import java.util.HashMap;
import java.util.Map;

public class FalseSenseOfSecurity {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        HashMap<Character, String> map = new HashMap<>();
        map.put('A', ".-");
        map.put('B', "-...");
        map.put('C', "-.-.");
        map.put('D', "-..");
        map.put('E', ".");
        map.put('F', "..-.");
        map.put('G', "--.");
        map.put('H', "....");
        map.put('I', "..");
        map.put('J', ".---");
        map.put('K', "-.-");
        map.put('L', ".-..");
        map.put('M', "--");
        map.put('N', "-.");
        map.put('O', "---");
        map.put('P', ".--.");
        map.put('Q', "--.-");
        map.put('R', ".-.");
        map.put('S', "...");
        map.put('T', "-");
        map.put('U', "..-");
        map.put('V', "...-");
        map.put('W', ".--");
        map.put('X', "-..-");
        map.put('Y', "-.--");
        map.put('Z', "--..");
        map.put('_', "..--");
        map.put(',', ".-.-");
        map.put('.', "---.");
        map.put('?', "----");
        while (io.hasMoreTokens()) {
        String msg = io.getWord(), output = "", num = "";
        for (int i = 0; i < msg.length(); i++) {
            output += map.get(msg.charAt(i));
            num += map.get(msg.charAt(i)).length();
        }
        StringBuilder build = new StringBuilder();
        build = build.append(num).reverse();
        num = build.toString(); // marks the completion of step 2
        String res = "";
        int first = 0, second = 0;
        for (int i = 0; i < num.length(); i++) {
            second = first + Integer.parseInt(String.valueOf(num.charAt(i))); // need to turn char to String first
            for (Map.Entry<Character, String> entry : map.entrySet()) { // iterate through all the keys and values
                if (entry.getValue().equals(output.substring(first, second))) {
                    res += entry.getKey(); // get the key if condition is satisfied
                    first = second;
                }
            }
        }
        io.println(res);
        }
        io.flush();
    }
}