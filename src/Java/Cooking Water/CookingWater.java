public class CookingWater {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int max = 0;
        int min = Integer.MAX_VALUE;
        while (n-- > 0) {
            max = Math.max(max, io.getInt());
            min = Math.min(min, io.getInt());
        }
        if (max - min <= 0) {
            io.print("gunilla has a point");
        } else {
            io.print("edward is right"); // means there is no common point that all 3 intervals intersect
        }
        io.flush();
    }
}