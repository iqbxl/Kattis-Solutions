import java.util.Scanner;

class Fraction {
    private int num; // In order for different Fraction objects to have their own fields, don't use static.
    private int den; // It will overwrite these static fields with new values

    private Fraction(int num, int den) {
        int gcd = findGCD(num, den);
        this.num = num / gcd;
        this.den = den / gcd;
    }

    public static Fraction getFraction(int num, int den) { // must be static 
        return new Fraction(num, den);
    }

    public int findGCD(int num, int den) {
        if (den == 0) {
            return Math.abs(num);
        } else {
            return findGCD(den, num % den);
        }
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return num;
    }

    public Fraction minus(Fraction other) {
        return new Fraction(this.num * other.den - other.num * this.den, this.den * other.den);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.num * other.num, this.den * other.den);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}

public class TemperatureConfusion {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("/");
        Fraction fr = Fraction.getFraction(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        Fraction thirtyTwo = Fraction.getFraction(32, 1);
        Fraction fiveOverNine = Fraction.getFraction(5, 9);
        System.out.println(fr.minus(thirtyTwo).multiply(fiveOverNine));
        sc.close();
    }
}