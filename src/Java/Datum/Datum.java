import java.util.HashMap;

public class Datum {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        HashMap<Integer, Integer> months = new HashMap<Integer, Integer>() {
            {
                put(1, 31);
                put(2, 28);
                put(3, 31);
                put(4, 30);
                put(5, 31);
                put(6, 30);
                put(7, 31);
                put(8, 31);
                put(9, 30);
                put(10, 31);
                put(11, 30);
                put(12, 31);
            }
        };
        HashMap<Integer, String> dayOfWeek = new HashMap<Integer, String>() {
            {
                put(0, "Wednesday");
                put(1, "Thursday");
                put(2, "Friday");
                put(3, "Saturday");
                put(4, "Sunday");
                put(5, "Monday");
                put(6, "Tuesday");
            }
        };

        int day = io.getInt(), month = io.getInt();
        if (month != 1) {
            for (int i = 1; i < month; i++) {
                day += months.get(i);
            }
        }
        io.println(dayOfWeek.get(day % 7));
        io.flush();
    }
}