public class ProvincesAndGold {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int G = io.getInt(), S = io.getInt(), C = io.getInt();
        int buyingPow = G * 3 + S * 2 + C;
        if (buyingPow >= 8) {
            io.print("Province or Gold");
        } else if (buyingPow >= 6) {
            io.print("Duchy or Gold");
        } else if (buyingPow == 5) {
            io.print("Duchy or Silver");
        } else if (buyingPow >= 3) {
            io.print("Estate or Silver");
        } else if (buyingPow == 2) {
            io.print("Estate or Copper");
        } else if (buyingPow >= 0) {
            io.print("Copper");
        }
        io.flush();
    }
}