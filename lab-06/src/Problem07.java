import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number = inp.nextInt();
        System.out.println("The number is " + number + ", and the reversed number is " + reversedNum(number));
        boolean checker = true;
        if (isPalindrome(number) == checker) {
            System.out.println("The "+ number + " is palindrome");
        } else {
            System.out.println("The " + number + " is not palindrome");
        }
    }
    static int reversedNum(int number) {
        int numReversed = 0;

        while (number != 0) {
            numReversed = (numReversed*10)+number % 10;
            number /= 10;

        }
        return numReversed;
    }
    static boolean isPalindrome (int number) {
        if (number == reversedNum(number)) {
            return true;
        } else {
            return false;
        }

    }
}
