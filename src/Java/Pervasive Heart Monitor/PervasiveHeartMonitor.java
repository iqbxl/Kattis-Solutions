import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PervasiveHeartMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            String name = "";
            List<Double> readings = new ArrayList<>();
            for (int i = 0; i < line.length; i++) {
                if (Character.isLetter(line[i].charAt(0)) == true) {
                    name += line[i] + " ";
                } else {
                    readings.add(Double.parseDouble(line[i]));
                }
            }
            double sum = 0;
            int size = readings.size();
            while (!readings.isEmpty()) {
                sum += readings.remove(0);
            }
            System.out.println(sum / size + " " + name);
        }
        sc.close();
    }
}