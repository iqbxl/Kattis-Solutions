import java.util.Scanner;

public class BuildingPyramids {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int length = 1;
    int currentBlocks = 0;
    int height = 0;
    while (n >= length * length) {
      n -= length * length;
      length += 2;
      height++;
    }
    System.out.println(height);
    sc.close();
  }
}