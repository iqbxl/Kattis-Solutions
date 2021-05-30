import java.util.Stack; //ArrayDeque is also possible for this qn

class Pair { //class Pair contains a numerator and denominator
    public int num;
    public int den;
    
    public Pair(int num, int den) { //object Pair is created which accepts 2 arguments
        this.num = num;
        this.den = den;
    }
}

public class ARationalSequence2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        for (int i = 0; i < p; i++) {
            int k = io.getInt();
            String[] frac = io.getWord().split("/");
            Pair pair = new Pair(Integer.parseInt(frac[0]), Integer.parseInt(frac[1]));
            Stack<Pair> q = new Stack<>(); //use LIFO principle to obtain the last element first
            while (pair.num != 1 || pair.den != 1) {
                q.push(new Pair(pair.num, pair.den)); //new Pair object is created for each loop
                if (pair.num > pair.den) {    
                    pair.num -= pair.den; //this does NOT change the original pair
                } else {
                    pair.den -= pair.num; //this does NOT change the original pair
                }
            }
            int n = 1;                  //start from the root of the binary tree
            while (!q.isEmpty()) {
                Pair out = q.pop(); //depth: 2 of tree is popped out first, followed by depth: 3, 4 etc
                n *= 2;             //for every level down, index of parent node * 2
                if (out.num > out.den) {
                    n += 1;     //2n for left child, 2n + 1 for right subchild
                }                   //^^ IMPT CHARACTERISTIC OF TREES
            }
            io.println(k + " " + n);
        }
        io.flush();
    }
}