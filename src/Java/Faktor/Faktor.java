public class Faktor {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt(), i = io.getInt(); 
        int x = a * i;
        while ((double) --x / a > i - 1) {
        }
        io.println(++x);
        io.flush();
    }
}