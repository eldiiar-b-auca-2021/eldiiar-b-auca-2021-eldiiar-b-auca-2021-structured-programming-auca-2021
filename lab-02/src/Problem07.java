import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double r = inp.nextDouble();
        double l = inp.nextDouble();

        double a = r * r * Math.PI;
        double v = a * l;

        System.out.printf("The area is %.4f ",a);
        System.out.println();
        System.out.printf("The volume is %.1f",v);



    }
}
