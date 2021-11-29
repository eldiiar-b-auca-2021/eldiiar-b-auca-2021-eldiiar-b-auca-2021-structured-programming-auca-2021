import java.util.Scanner;

public class URI1146 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int anyNum;

        do  {
            anyNum = inp.nextInt();
            for (int i = 1; i <= anyNum; i++) {
                System.out.print(i + " ");
            }

        } while (anyNum != 0);
    }
}
