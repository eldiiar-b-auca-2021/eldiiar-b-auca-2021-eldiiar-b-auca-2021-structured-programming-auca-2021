import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int personsAgeInDay = inp.nextInt();
        int a = personsAgeInDay / 365;
        personsAgeInDay %= 365;
        int c = personsAgeInDay / 30;
        personsAgeInDay %= 30;

        System.out.println(a + " " + "ano(s)");
        System.out.println(c + " " + "mes(es)");
        System.out.println(personsAgeInDay + " " + "dia(s)");

    }
}
