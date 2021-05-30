public class Kafkaesque {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int k = io.getInt();
        int[] arr = new int[k];
        int count = 1;
        for (int i = 0; i < k; i++) {
            arr[i] = io.getInt();
        }
        for (int i = 0; i < k - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        io.print(count);
        io.flush();
    }
}