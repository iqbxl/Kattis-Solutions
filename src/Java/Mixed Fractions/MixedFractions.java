public class MixedFractions {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        for (;;) {
            String str = io.getLine();
            if (str.equals("0 0")) {
                break;
            }
            String[] input = str.split(" ");
            int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
            int whole = a / b, num = a - (whole * b);
            io.println(whole + " " + num + " " + "/" + " " + b);
        }
        io.flush();
    }
}