import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int count = 0;
        int number;
        do {
            System.out.print("Enter an integer (the inputs ends if it is 0): ");
            number = inp.nextInt();
            count+=number;

        } while (number != 0);

        System.out.println("The sum is " + count);
    }
}
