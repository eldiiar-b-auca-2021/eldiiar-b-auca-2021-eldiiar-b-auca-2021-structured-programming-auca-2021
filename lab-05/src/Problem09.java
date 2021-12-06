import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");

        Scanner inp = new Scanner(System.in);

        String s = inp.nextLine();

        int highestPoint = s.length() -1;

        int lowestPoint = 0;
        boolean palindrome = true;

        while (lowestPoint < highestPoint) {

            if (s.charAt(lowestPoint) != s.charAt(highestPoint)) {
                palindrome = false;
                break;
            }
            lowestPoint++;
            highestPoint--;

        }
        if (palindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }

    }
}

