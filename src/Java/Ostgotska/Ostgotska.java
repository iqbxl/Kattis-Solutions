public class Ostgotska {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String[] words = io.getLine().split(" ");
        double sum = 0;
        for (String str : words) {
            if (str.contains("ae")) {
                sum++;
            }
        }
        io.print(sum / words.length * 100 >= 40
                ? "dae ae ju traeligt va"
                : "haer talar vi rikssvenska");
        io.flush();
    }
}