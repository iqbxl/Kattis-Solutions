import java.util.HashSet;

public class Everywhere {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int testcases = io.getInt();
        //Since HashSet implements Set Interface, duplicates are not allowed!!! (A set is a Collection)
        HashSet<String> cities = new HashSet<String>();
        for (int i = 0; i < testcases; i++) {
            int n = io.getInt();
            for (int j = 0; j < n; j++) {
                cities.add(io.getWord());
            }
            io.println(cities.size());
            cities.clear(); //remove all elements in HashSet
        }
        io.flush();
    }
}