import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();


        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        } else if (b > c) {
            if (c > a) {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            } else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        } else if (c > b) {
            if (b > a) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }
        } else if (a == b) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
