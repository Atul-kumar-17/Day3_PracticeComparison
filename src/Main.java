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
        // equating 2 line's length
        System.out.println("enter the a1 = ");
        double a1 = Sc.nextDouble();
        System.out.println("enter the b1 = ");
        double b1 = Sc.nextDouble();
        System.out.println("enter the a2 = ");
        double a2 = Sc.nextDouble();
        System.out.println("enter the b2 = ");
        double b2 = Sc.nextDouble();
        double length1 = Math.sqrt((a2-a1) + (b2-b1));
        System.out.println("length1 = " +length1);
        if ( length==length1){
            System.out.println("length are equal");
        }else{
            System.out.println("length are not equal");
        }
    }
}



