import java.util.Scanner;

public class URI1159 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input ;
        int j = 0,sum = 0;
        while ((input = in.nextInt()) != 0) {
            for (int i = input; j < 5; i++){
                if (i % 2 == 0) {
                    j++;
                    sum+=i;
                }
            }
            System.out.println(sum);
            sum=0;
            j=0;
        }
    }
}
