import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int lottery =  (int) (Math.random() * 100);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = inp.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit = guess / 10;
        int guessDigit2 = guess % 10;



        if (lottery == guess) {
            System.out.println("");
        }
    }
}
