import java.util.*;

public class URI1173 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] set = new int [10];
        set[0] = in.nextInt();

        for (int i = 0; i < set.length; i++) {
            System.out.printf("N[%d] = %d\n",i,set[0]);
            set[0]*=2;
        }
    }
}