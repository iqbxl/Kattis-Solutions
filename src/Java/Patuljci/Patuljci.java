public class Patuljci {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int[] input = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            input[i] = io.getInt();
            sum += input[i];
        }
        int notRequired = sum - 100;
        int dwarfOne = 0;
        int dwarfTwo = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (input[i] + input[j] == notRequired) {
                    dwarfOne = i;
                    dwarfTwo = j;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != dwarfOne && i != dwarfTwo) {
                io.println(input[i]);
            }
        }
        io.flush();
    }
}