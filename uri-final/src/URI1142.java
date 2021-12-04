import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number = inp.nextInt();

        for (int i = 1; i < number*4; i+=4) {
            System.out.println(i + " " + (i + 1) + " " + (i + 2) + " PUM");
        }
    }
}