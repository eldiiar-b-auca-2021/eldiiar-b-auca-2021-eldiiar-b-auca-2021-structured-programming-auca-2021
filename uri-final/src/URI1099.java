import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numberOfLoop = inp.nextInt();
        int x;
        int y;
        int sumOfNumbers = 0;

        for (int i = 1; i <= numberOfLoop; i++) {
            x = inp.nextInt();
            y = inp.nextInt();

            if (y > x) {

                for (int j = x; j < y; j++) {
                    if (j % 2 != 0) {
                        sumOfNumbers += j;
                    }
                }
            } else if (x > y){

                for (int k = y; k < x; k++) {
                    if (k % 2 != 0) {
                        sumOfNumbers += k;
                    }
                }

            } else {
                sumOfNumbers+=0;
            }
            System.out.println(sumOfNumbers);
        }



    }
}