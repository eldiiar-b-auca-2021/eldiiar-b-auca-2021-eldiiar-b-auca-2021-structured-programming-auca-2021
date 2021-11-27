import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int temp;
        int counterOfSum = 0;
        int x = inp.nextInt();
        int y = inp.nextInt();

        while ( x > 0 && y > 0) {
            if (x > y) {
               temp = y;
               y = x;
               x = temp;
            }
                for (int i = x; i <= y; i++) {
                    counterOfSum += i;
                    System.out.print(i + " ");
                }

                System.out.println("Sum=" + counterOfSum);
                counterOfSum=0;
                x = inp.nextInt();
                y = inp.nextInt();
            }
        }

    }

