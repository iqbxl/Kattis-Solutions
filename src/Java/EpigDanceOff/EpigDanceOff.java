public class EpigDanceOff {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int m = io.getInt();
        int[] arr = new int[m];
        for (int i = 0; i < n; i++) {
            char[] line = io.getLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (line[j] == '_') {
                    arr[j]++;
                }
            }
        }
        int count = 1;
        for (int i : arr) {
            if (i == n) {
                count++;
            }
        }
        io.print(count);
        io.flush();
    }
}