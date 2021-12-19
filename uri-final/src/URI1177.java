import java.util.*;

public class URI1177 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[1000];
        int min = in.nextInt();
        int j, i;
        for ( i = 0, j = 0; i < arr.length; i++,j++) {
            if (j == min) {
                j = 0;
            }
            System.out.printf("N[%d] = %d\n",i,j);
        }
    }
}
