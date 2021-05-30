import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Preludes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        Map<String, String> map = new HashMap<>();
        map.put("A#", "Bb");
        map.put("Bb", "A#");
        map.put("C#", "Db");
        map.put("Db", "C#");
        map.put("D#", "Eb");
        map.put("Eb", "D#");
        map.put("F#", "Gb");
        map.put("Gb", "F#");
        map.put("G#", "Ab");
        map.put("Ab", "G#");
        while (sc.hasNext()) { // for some reason, io.hasMoreTokens() doesn't work...
            String[] line = sc.nextLine().split(" ");
            if (line[0].length() == 1) {
                System.out.println("Case " + i + ": UNIQUE");
            } else {
                System.out.println("Case " + i + ": " + map.get(line[0]) + " " + line[1]);
            }
            i++;
        }
        sc.close();
    }
}