import java.util.Scanner;

public class SMIL {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String smile1 = ":)";
    String smile2 = ";)";
    String smile3 = ":-)";
    String smile4 = ";-)";
    for (int i = 0; (i = input.indexOf(smile1, i)) != -1; i++) {
      System.out.println(i);
    }
    for (int i = 0; (i = input.indexOf(smile2, i)) != -1; i++) {
      System.out.println(i);
    }
    for (int i = 0; (i = input.indexOf(smile3, i)) != -1; i++) {
      System.out.println(i);
    }
    for (int i = 0; (i = input.indexOf(smile4, i)) != -1; i++) {
      System.out.println(i);
    }
    sc.close();
  }
}