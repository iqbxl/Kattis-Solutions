public class LostLineup {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int[] A = new int[n];
        A[0] = 1;
        for (int i = 0; i < n - 1; i++) {
            int space = io.getInt();
            A[space + 1] = i + 2;
        }
        String str = "";
        for (int i : A) {
            str += i + " ";
        }
        io.print(str.trim());
        io.flush();
    }
}