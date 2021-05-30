public class InquiryI {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = io.getInt();
        }
        long max = 0;
        for (int i = 1; i < n; i++) {
            max += arr[i];
        }
        long term1 = arr[0] * arr[0]; // 4
        long term2 = max; //13
        max = term1 * term2;
        for (int j = 1; j < n; j++) { // Window sliding technique (Time comlexity is O(n) as there is only one loop)
            term1 += arr[j] * arr[j];
            term2 -= arr[j];
            max = Math.max(max, term1 * term2); // comparing results of each loop iteration
        }
        io.print(max);
        io.flush();
    }
}