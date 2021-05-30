public class Mancala {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        while (p-- > 0) {
            int k = io.getInt();
            int n = io.getInt();
            int lastIndex = 0;
            int[] arr = new int[2000];
            for (int i = 0; i < n; i++) { // generate all possible winnable Mancala boards from smaller boards
                lastIndex = 0;
                while (arr[lastIndex] != 0) {
                    lastIndex++;
                }
                arr[lastIndex] = lastIndex + 1;
                for (int j = 0; j < lastIndex; j++) {
                    arr[j]--;
                }
            }
            lastIndex = 1999;
            while (arr[lastIndex] == 0) { // start counting from the end of the array
                lastIndex--;
            }
            io.println(k + " " + (lastIndex + 1));
            for (int i = 0; i <= lastIndex; i++) {
                io.print(arr[i] + " ");
                if (i % 10 == 9) {
                    io.println();
                }
            }
            io.println();
        }
        io.flush();
    }
}