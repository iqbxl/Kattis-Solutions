public class FiftyShades {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String name = io.getWord();
            if (name.toLowerCase().contains("pink") || name.toLowerCase().contains("rose")) {
                count++;
            }
        }
        io.print(count == 0 ? "I must watch Star Wars with my daughter" : count);
        io.flush();
    }
}