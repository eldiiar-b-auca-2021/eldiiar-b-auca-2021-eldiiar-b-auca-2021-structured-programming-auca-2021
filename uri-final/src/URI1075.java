import java.util.Scanner;

public class URI1075 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int i = 1;
        while(i != 10000) {
          if ((i%num) == 2) {
              System.out.println(i);
          }
            i++;
        }
    }
}
