import java.util.Map;
import java.util.HashMap;

public class ANewAlphabet {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        
        Map<Character, String> map = new HashMap<>();
        map.put('a', "@");
        map.put('b', "8");
        map.put('c', "(");
        map.put('d', "|)");
        map.put('e', "3");
        map.put('f', "#");
        map.put('g', "6");
        map.put('h', "[-]");
        map.put('i', "|");
        map.put('j', "_|");
        map.put('k', "|<");
        map.put('l', "1");
        map.put('m', "[]\\/[]");
        map.put('n', "[]\\[]");
        map.put('o', "0");
        map.put('p', "|D");
        map.put('q', "(,)");
        map.put('r', "|Z");
        map.put('s', "$");
        map.put('t', "']['");
        map.put('u', "|_|");
        map.put('v', "\\/");
        map.put('w', "\\/\\/");
        map.put('x', "}{");
        map.put('y', "`/");
        map.put('z', "2");

        String text = io.getLine().toLowerCase();
        String ans = "";
        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                ans += map.get(text.charAt(i));
            } else {
                ans += text.charAt(i);
            }
        }
        io.print(ans);
        io.flush();
    }
}