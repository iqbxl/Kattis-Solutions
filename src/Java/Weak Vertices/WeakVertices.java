public class WeakVertices {
    public static boolean isTriangle(int k, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[k][i] == 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[k][j] == 1 && arr[i][j] == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int n = io.getInt();
            if (n == -1) {
                break;
            } 
            int[][] A = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = io.getInt();
                }
            }
            String res = "";
            for (int k = 0; k < n; k++) {
                if (isTriangle(k, A)) {
                    continue;
                }
                res += k + " ";
            }
            io.println(res.trim());
        }
        io.flush();
    }
}