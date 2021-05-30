public class WhichBase {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
            int p = io.getInt();
        for (int i = 0; i < p; i++) {
            int k = io.getInt(), decimal = io.getInt();
            String decimalStr = String.valueOf(decimal); 
            io.println(k + " " + (decimalStr.contains("8") || decimalStr.contains("9") ? 0 
                    : Integer.parseInt(decimalStr, 8)) + " " + decimal + " " + Integer.parseInt(decimalStr, 16));
        }
        io.flush();
    }
}