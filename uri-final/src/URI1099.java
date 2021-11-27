import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numberOfLoop = inp.nextInt();
        int x;
        int y;
        int sumOfNumbers = 0;
        int swap;
        for (int i = 1; i <= numberOfLoop; i++) {
            x = inp.nextInt();
            y = inp.nextInt();

            if (y > x) {
                swap = x;
                x = y;
                y = swap;
            }

            for (int j = y+1; j < x; j++) {
                if (j % 2 != 0) {
                    sumOfNumbers += j;
                }


            }
            System.out.println(sumOfNumbers);
            sumOfNumbers = 0;
        }
    }
}