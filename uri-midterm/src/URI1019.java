import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int s = inp.nextInt();

        int hours = s/3600;
        s%=3600;

        int minutes = s/60;
        s%=60;

        System.out.println(hours + ":" + minutes + ":" + s);
    }
}
