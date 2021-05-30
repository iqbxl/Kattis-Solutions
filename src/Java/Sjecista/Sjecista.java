public class Sjecista {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        // Note that ans is always less than or equal to the formula below because an ideal case when
        // each intersection point is corresponding to a unique pair of diagonals (not 2 or more pairs)
        // then by choosing 4 vertices of n we will have 2 diagonals and this pair of diagonals determine
        // an intersection point AND this point is not an intersection point for any other pair of diagonals
        io.print(n * (n - 1) * (n - 2) * (n - 3) / (1 * 2 * 3 * 4));
        io.flush();
    }
}
// for convex REGULAR polygon, there are cases which more than 1 pair of diagonals share a same point