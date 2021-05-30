public class BabyBites {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String[] input = io.getLine().split(" ");
        boolean fishy = false;
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("mumble")) {
                int x = Integer.parseInt(input[i]);
                if (x != i + 1) {
                    fishy = true;
                    break;
                }
            }
        }
        io.print(fishy ? "something is fishy" : "makes sense");
        io.flush();
    }
}