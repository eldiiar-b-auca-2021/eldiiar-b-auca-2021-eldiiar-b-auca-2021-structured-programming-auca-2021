import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("A four-digit integer?");
        int a = inp.nextInt();//   4567
        int b = a / 1000; //       4567/1000=4
        a=a%1000;//                4567 / 1000 = 567 ostatok
        int c = a / 100; //        567 / 100 = 5
        a=a%100; //                567 / 100 = 67 ostatok
        int d = a / 10; //         67 / 10 = 6
        a=a%10; ///                67 / 10 = 7 ostatok
        int s = a / 1; //          7 / 1 = 7
        a=a%1;                  // 7 / 1 = 0  ostatok

        int sum = b + c + d + s;

        System.out.println("The sum of all digits is " + sum);
    }
}
