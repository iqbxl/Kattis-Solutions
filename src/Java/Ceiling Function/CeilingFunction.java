import java.util.Set;
import java.util.HashSet;

public class CeilingFunction {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        Set<String> set = new HashSet<>(); // use hash set to prevent duplicate strings being added
        int n = io.getInt(), k = io.getInt();
        for (int i = 0; i < n; i++) {
            BST tree = new BST();          // refer to implementation of bst
            for (int j = 0; j < k; j++) {
                tree.insert(io.getInt());
            }
            set.add(tree.toString());      // for each bst object created, add its string(id) to the hashset
        }
        io.print(set.size());
        io.flush();
    }
}