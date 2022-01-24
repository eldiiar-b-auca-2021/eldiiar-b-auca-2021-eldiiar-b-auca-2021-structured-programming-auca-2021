import java.util.Scanner;

public class URI1189 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String l = in.next();
        double[][] set = new double[12][12];
        double sum = 0;
        double n = 0, num = 5;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < num; j++) {
                if (i > j) {
                    sum += set[i][j];
                }
                if (j == 4) {
                    j--;
                    n++;
                }
                if (n == 2) {
                    j++;
                }
            }
            num--;
        }
    }
}
