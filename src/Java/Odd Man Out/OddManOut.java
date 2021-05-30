import java.util.HashSet; //***Set does not allow duplicate entities

public class OddManOut {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int N = io.getInt();
        for (int i = 0; i < N; i++) {
            int G = io.getInt();
            HashSet <Integer> x = new HashSet <Integer>(); //create hashset to store integers
            for (int j = 0; j < G; j++) {
                int C = io.getInt();
                if (x.contains(C)) {
                    x.remove(C); //remove if number is duplicate
                } else {
                    x.add(C); //add if number is unique
                }
            }
            for (int k : x) { //iterate over the elements in hashset (in this case, only one element left)
                io.println("Case #" + (i + 1) + ": " + k); //print the element k in the hashset
            }
        }
        io.flush();
    }
}