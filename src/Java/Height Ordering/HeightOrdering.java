public class HeightOrdering {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        for (int i = 0; i < p; i++) {
            int k = io.getInt();
            int[] arr = new int[20]; 
            for (int j = 0; j < 20; j++) {
                arr[j] = io.getInt();
            }
            int steps = 0;                 // Insertion sort algorithm
            for (int m = 1; m < 20; m++) { // m is the array length
                int key = arr[m];          // key is the current number
                int n = m - 1; 
                while (n >= 0 && arr[n] > key) {
                    arr[n + 1] = arr[n];
                    n--;
                    steps++;
                }
                arr[n + 1] = key;          // update last position with current key
            }
            io.println(k + " " + steps);
        }
        io.flush();
    }
}