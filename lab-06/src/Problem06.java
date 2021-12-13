import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long totalNum = numDigits(inp.nextInt());
        System.out.println(totalNum);
    }
    public static int numDigits (long n) {
        int result = 0;
        while (n != 0) {
            result += n % 10;
            n = n / 10;
        }
        return result;
    }
}
