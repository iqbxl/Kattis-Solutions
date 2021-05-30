import java.util.TreeSet;

public class LineThemUp {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        TreeSet<String> names = new TreeSet<>();
        int n = io.getInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String name = io.getWord();
            names.add(name);
            arr[i] = name;
        }
        int asc = 0;
        for (String name : names) {
            if (name.equals(arr[asc])) {
                asc++;
            }
        }
        TreeSet<String> reverseNames = (TreeSet<String>)names.descendingSet();
        int des = 0;
        for (String name : reverseNames) {
            if (name.equals(arr[des])) {
                des++;
            }
        }
        int len = arr.length;
        io.print(asc == n ? "INCREASING" : des == n ? "DECREASING" : "NEITHER");
        io.flush();
    }
}