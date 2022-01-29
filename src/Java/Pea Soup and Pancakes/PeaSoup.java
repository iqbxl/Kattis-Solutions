import java.util.Scanner;

public class PeaSoup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean check = true;

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(sc.nextLine());
            String restaurant = sc.nextLine();
            boolean ps, pan;
            ps = pan = false;

            for (int j = 0; j < k; j++) {
                String item = sc.nextLine();
                if (item.equals("pea soup")) {
                    ps = true;
                } else if (item.equals("pancakes")) {
                    pan = true;
                }
            }
            if (ps && pan) {
                System.out.println(restaurant);
                check = false;
                sc.close();
                break;
            }
        }
        if (check) {
            System.out.println("Anywhere is fine I guess");
            sc.close();
        }
    }
}


