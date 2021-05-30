import java.util.HashSet;
import java.util.Arrays;
import java.util.List;

public class MusicalScales {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"}; 
        String[] scale = new String[8];
        HashSet<String> hs = new HashSet<>();
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            hs.add(io.getWord());
        }
        String res = "";
        for (int i = 0; i < 12; i++) {
            scale[0] = notes[i];
            scale[1] = notes[(i + 2) % 12]; 
            scale[2] = notes[(i + 4) % 12];
            scale[3] = notes[(i + 5) % 12];
            scale[4] = notes[(i + 7) % 12];
            scale[5] = notes[(i + 9) % 12];
            scale[6] = notes[(i + 11) % 12];
            scale[7] = notes[(i + 12) % 12];
            
            List<String> lst = Arrays.asList(scale);
            if (lst.containsAll(hs)) {
                res += scale[0] + " ";
            }
        }
        io.println(res.length() == 0 ? "none" : res.trim());
        io.flush();
    }
}