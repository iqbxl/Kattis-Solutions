public class Parking {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int[] A = new int[101];
        int cost = 0;
        int a = io.getInt(), b = io.getInt(), c = io.getInt();
        int arr1 = io.getInt(), dep1 = io.getInt(), arr2 = io.getInt(), dep2 = io.getInt(),
            arr3 = io.getInt(), dep3 = io.getInt();
        for (int i = arr1; i < dep1; i++) {
            A[i]++;
        }
        for (int i = arr2; i < dep2; i++) {
            A[i]++;
        }
        for (int i = arr3; i < dep3; i++) {
            A[i]++;
        }
        for (int i = 1; i < 101; i++) {
            if (A[i] == 1) {
                cost += a;
            }
            if (A[i] == 2) {
                cost += b * 2;
            }
            if (A[i] == 3) {
                cost += c * 3;
            }
        }
        io.print(cost);
        io.flush();
    }
}