import java.util.Scanner;

public class URI1187 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] set = new double[12][12];
        String l = in.next();
        double sum = 0;
        double count = 0;
        double length = 12;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                set[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++){
                if (j > i && j < length) {
                    sum += set[i][j];
                }
            }
            length--;
        }
        if (l.equals("S")) {
            System.out.printf("%.1f\n",sum);
        }
        double average = sum/30;
        if (l.equals("M")) {
            System.out.printf("%.1f\n",average);
        }
    }
}
