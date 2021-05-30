public class ReversedBinary {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String str = Integer.toBinaryString(io.getInt());
        StringBuilder sb = new StringBuilder();
        sb = sb.append(str).reverse();
        String binary = sb.toString();
        io.print(Integer.parseInt(binary, 2));
        io.flush();
    }
}