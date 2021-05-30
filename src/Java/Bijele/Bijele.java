public class Bijele {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int perm[] = {1, 1, 2, 2, 2, 8}; //create new array with given numbers
        int input[] = new int[6]; //create new array for the incoming input
        for (int i = 0; i < 6; i++) { //iterate through and fill in array with the input
            input[i] = io.getInt();
        }
        for (int j = 0; j < 6; j++) {
            io.println(perm[j] - input[j]); //access both array elements and compare
        }
        io.flush();
    }
}