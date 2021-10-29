import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Number of points? ");
        int num = inp.nextInt();

        if ((num >= 90) && (num <= 100)) {
            System.out.println("Grade: A");
        }
        if ((num >= 80) && (num <= 90)) {
            System.out.println("Grade: B");
        }
        if ((num >= 70) && (num <= 80)) {
            System.out.println("Grade: C");
        }
        if ((num >= 60) && (num <= 70)) {
            System.out.println("Grade: D");
        }
        if (num < 60) {
            System.out.println("Grade: F");
        }
        if (num > 100) {
            System.out.printf("%d is not the permitted range.",num);
        }


    }
}
