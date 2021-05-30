public class Filip {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        Integer a = io.getInt();
        Integer b = io.getInt();

        String s1 = new String(new StringBuilder().append(a).reverse()); //use StringBuilder's reverse() method
        String s2 = new StringBuilder().append(b).reverse().toString();
        
        int num1 = Integer.parseInt(s1); //convert string to integer
        int num2 = Integer.parseInt(s2);
        
        io.println(num1 > num2 ? num1 : num2);
        io.flush();
    }
}