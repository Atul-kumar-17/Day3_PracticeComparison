import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison");
        // length between 2 coordinates
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the x1 = ");
        double x1 = Sc.nextDouble();
        System.out.println("enter the y1 = ");
        double y1 = Sc.nextDouble();
        System.out.println("enter the x2 = ");
        double x2 = Sc.nextDouble();
        System.out.println("enter the y2 = ");
        double y2 = Sc.nextDouble();
        double length = Math.sqrt(x2-x1) +Math.sqrt(y2-y1);
        System.out.println("Lenght between two points = " +length);
    }
}