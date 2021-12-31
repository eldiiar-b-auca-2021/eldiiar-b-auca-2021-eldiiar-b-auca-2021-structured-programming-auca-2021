import java.util.Scanner;

public class URI1158 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int testCases = inp.nextInt();
        int x, y, j, k = 0,sum = 0;
        int i = 0;
       while (i < testCases) {
           x = inp.nextInt();
           y = inp.nextInt();
           for (j= x; k < y; x++) {
               if (x%2 != 0) {
                   sum+=x;
                   k++;
               }
           }
           System.out.println(sum);
           sum = 0;
           k = 0;
           i++;
       }
    }
}