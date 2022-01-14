import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = 0, y = 0, count = 0;
        for (int i = 0; i < 6; i++) {
            x = in.nextDouble();
            if (x > 0) {
                y+=x;
                count++;
            }
        }
        double average = y / count;
        System.out.printf("%.0f valores positivos\n",count);
        System.out.printf("%.1f\n",average);
    }
}
