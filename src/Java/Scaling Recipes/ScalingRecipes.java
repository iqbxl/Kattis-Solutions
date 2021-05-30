import java.util.Map;
import java.util.LinkedHashMap;

public class ScalingRecipes {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        int k = 1;
        while (t-- > 0) {
            int r = io.getInt();
            int p = io.getInt();
            int d = io.getInt();
            double sf = (double) d / p; // scaling factor
            double scaledMain = 0;
            Map<String, Double> map = new LinkedHashMap<>(); // since order is impt
            for (int i = 0; i < r; i++) {
                String name = io.getWord();
                double weight = io.getDouble(); // only main ingredient's weight is useful
                double percentage = io.getDouble();
                if (percentage == 100) { // check if main ingredient
                    scaledMain = weight * sf;
                }
                map.put(name, percentage);
            }
            io.println("Recipe # " + k++);
            for (String s : map.keySet()) {
                io.print(s + " ");
                io.printf("%.1f\n", map.get(s) / 100 * scaledMain);
            }
            io.println("----------------------------------------");
        }
        io.flush();
    }
}