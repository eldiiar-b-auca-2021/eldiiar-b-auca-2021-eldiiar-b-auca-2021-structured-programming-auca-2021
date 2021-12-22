import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] set = new double[10];
        for (int i = 0; i < set.length; i++) {
            set[i] = in.nextInt();
        }
        double index = indexOfSmallestElement(set);
        System.out.println("The index of the smallest num is " + index);
    }
    public static double indexOfSmallestElement(double[] set) {
        double minIndex = set[0];
        double finMinIndex = 0;
        for (int j = 0; j < set.length; j++) {
            if (minIndex > set[j]) {
                minIndex = set[j];
                finMinIndex = j;
            }
        }
        return finMinIndex;
    }
}
