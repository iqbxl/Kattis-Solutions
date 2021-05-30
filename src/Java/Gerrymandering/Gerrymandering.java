public class Gerrymandering {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int P = io.getInt(), D = io.getInt();
        int[] arrayA = new int[D]; //elements of array are all initialised to 0
        int[] arrayB = new int[D]; //elements of array are all initialised to 0
        double total = 0;
        for (int i = 0; i < P; i++) {
            int district = io.getInt(), A = io.getInt(), B = io.getInt();
            arrayA[district - 1] += A;
            arrayB[district - 1] += B;
            total += A + B;
        }
        int totalwastedA = 0, totalwastedB = 0; 
        for (int i = 0; i < D; i++) {
            if (arrayA[i] > arrayB[i]) {
                int wastedA = arrayA[i] - ((arrayA[i] + arrayB[i]) / 2 + 1);
                int wastedB = arrayB[i];
                totalwastedA += wastedA;
                totalwastedB += wastedB;
                io.println("A " + wastedA + " " + wastedB);
            } else {
                int wastedA = arrayA[i];
                int wastedB = arrayB[i] - ((arrayA[i] + arrayB[i]) / 2 + 1);
                totalwastedA += wastedA;
                totalwastedB += wastedB;
                io.println("B " + wastedA + " " + wastedB);
            }
        }
        io.println(totalwastedA > totalwastedB ? (totalwastedA - totalwastedB) / total
                               : (totalwastedB - totalwastedA) / total);
        io.flush();
    }
}