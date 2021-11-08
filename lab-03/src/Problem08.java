import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter three integer numbers: ");
        int first = inp.nextInt();
        int second = inp.nextInt();
        int third = inp.nextInt();

        if (first < second && first < third) {
            if (second < third) {
                System.out.println(first + "\n" + second + "\n" + third + "\n");
            } else {
                 System.out.println(first + "\n" + third + "\n" + second + "\n");
            }

        } else if (second < first && second < third) {
            if (first < third) {
                System.out.println(second + "\n" + first + "\n" + third + "\n");
            } else {
                  System.out.println(second + "\n" + third + "\n" + first + "\n");
            }

        } else if (third < second && third < first) {
                 if (second < first) {
                     System.out.println(third + "\n" + second + "\n" + first + "\n");
                 } else {
                      System.out.println(third + "\n" + first + "\n" + second + "\n");
                 }

        } else if (first == second && first == third) {
                        System.out.println(first + "\n" + second + "\n" + third + "\n");

        } else if (first == third) {
                          System.out.println(first + "\n" + third + "\n" + second + "\n");



        }
        }
    }

