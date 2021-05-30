import java.util.Arrays;
import java.util.HashMap;

public class SynchronizingLists {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        while (true) {
            int[] first = new int[n], second = new int[n];
            HashMap<Integer, Integer> idxMap = new HashMap<>(); //index map retrieves the original index
            for (int i = 0; i < n; i++) {                       //of elements from first list
                int a = io.getInt();
                first[i] = a;
                idxMap.put(a, i);
            }
            for (int i = 0; i < n; i++) {
                int b = io.getInt();
                second[i] = b;
            }
            Arrays.sort(first); //sort first list in order
            Arrays.sort(second);//sort second list in order
            int[] newSecond = new int[n];
            for (int i = 0; i < n; i++) {
                newSecond[idxMap.get(first[i])] = second[i]; //MAIN LOGIC
            }
            for (int i : newSecond) {
                io.println(i); //here, i refers to the element itself, NOT the index
            }
            n = io.getInt(); 
            if (n == 0) break; //determine whether next int is 0 or not
            io.println();      //if have more input, print a new line 
        }
        io.flush();
    }
}