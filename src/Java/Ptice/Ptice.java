public class Ptice {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        char[] A = {'A', 'B', 'C'}, B = {'B', 'A', 'B', 'C'}, C = {'C', 'C', 'A', 'A', 'B', 'B'}; //copy the 
        int n = io.getInt();                                                                      //pattern
        String answers = io.getWord();
        int resA = 0, resB = 0, resC = 0;
        for (int i = 0; i < n; i++) {
            if (answers.charAt(i) == A[i % 3]) { //divide by 3 and see if remainder is 0, 1 or 2 
                resA += 1;
            }
            if (answers.charAt(i) == B[i % 4]) {
                resB += 1;
            }
            if (answers.charAt(i) == C[i % 6]) {
                resC += 1;
            }
        }
        int largest = Math.max(resA, Math.max(resB, resC));
        io.println(largest);
        if (resA == largest) 
            io.println("Adrian");
        if (resB == largest) 
            io.println("Bruno");
        if (resC == largest) 
            io.println("Goran");
        io.flush();
    }
}