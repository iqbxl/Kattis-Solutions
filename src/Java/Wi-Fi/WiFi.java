import java.util.Arrays;

public class WiFi {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int test = io.getInt();
        for (int i = 0; i < test; i++) {
            int n = io.getInt(); // access pts
            int m = io.getInt(); // houses
            int[] houses = new int[m];
            
            for (int j = 0; j < m; j++) {
                houses[j] = io.getInt();
            }
            Arrays.sort(houses);
            double low = 0; //nearest house: best case
            double high = houses[m - 1]; //furthest house: worst case
            double result = 0; 
            
            while (low < high) {
                double mid = (low + high) / 2;
                if (WiFi.isFullCoverage(houses, mid, n)) {
                    result = mid; 
                    high = mid - 0.02; 
                } else {
                    low = mid + 0.02;
                }
            }
            int whole = (int) result; 
            double decimals = result - whole; 
            int third_ = (int) (decimals * 100); 
            int second_ = third_ % 10;
            int first_ = third_ / 10;
            
            if (second_ >= 5) {
                first_++;
            }
            result = whole + ((double) first_) / 10;
            io.println(result);
            io.flush();
        }

    }

    public static boolean isFullCoverage(int[] houses, double radius, int xx) {
        double distCovered = houses[0] + 2 * radius;
        xx--;
        boolean overall = true;
        for (int k = 0; k < houses.length; k++) { //check all except last house
            if (houses[k] > distCovered) {
                xx--;
                distCovered = (2 * radius) + houses[k];
            }
        }
        if (xx < 0) {
            return false;
        } else {
            return true;
        }
    }
}