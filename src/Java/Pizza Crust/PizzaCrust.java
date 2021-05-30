public class PizzaCrust {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt(), c = io.getInt();
        double areaCheese = Math.PI * (r - c) * (r - c);
        double areaPizza = Math.PI * r * r;
        io.println(areaCheese / areaPizza * 100);
        io.flush();
    }
}
