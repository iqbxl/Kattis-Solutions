public class Homework {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getLine();
        String[] parts = input.split(";");
        int counter = 0;
        for (int i = 0; i < parts.length; i++) {
            if (!parts[i].contains("-")) {
                counter++;
            } else {
                String[] range = parts[i].split("-");
                counter = counter + Integer.parseInt(range[1]) - Integer.parseInt(range[0]) + 1;
            }
        }
        io.print(counter);
        io.flush();
    }
}