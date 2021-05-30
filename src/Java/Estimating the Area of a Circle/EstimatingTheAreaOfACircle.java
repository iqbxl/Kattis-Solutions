public class EstimatingTheAreaOfACircle {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            String line = io.getLine();
            if (line.equals("0 0 0")) break; // line == "0 0 0" won't work
            String[] input = line.split(" ");
            double r = Double.parseDouble(input[0]);
            int m = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            io.println(Math.PI * r * r + " " + (double) c / m * (4 * r * r));
        }
        io.flush();
    }
}