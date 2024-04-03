import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //first number input
        System.out.println("Unesite prvi decimalni broj:");
        Scanner firstScanner = new Scanner(System.in);
        double x = firstScanner.nextDouble();

        //second number input
        System.out.println("Unesite drugi decimalni broj:");
        Scanner secondScanner = new Scanner(System.in);
        double y = secondScanner.nextDouble();

        //result
        double z = 3 * x + 4 * y;
        System.out.println("Rezultat funkcije z = 3 * x + 4 * y, za vrijdnost x od " + x + ", i y od " + y + " iznosi " + z + "!");


    }
}