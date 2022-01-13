import java.util.Scanner;

public class URI1188 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String l = in.next();
        double[][] set = new double[12][12];
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                set[i][j] = in.nextDouble();
            }
        }
        int leftSide = 4;
        double sum = 0;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set[i].length; j++) {
                if (i > j && j > set.length-i-1) {
                    sum+=set[i][j];
                }
            }
        }
        double average = sum/30;
        if (l.equals("S")){
            System.out.printf("%.1f\n",sum);
        }
        if (l.equals("M")) {
            System.out.printf("%.1f\n",average);
        }
    }
}
