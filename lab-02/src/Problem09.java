import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = inp.nextInt();

        int minutesToYears = minutes / 525600;

        int days = minutes % 525600;

        int resultOfDays = (days / 60) / 24;

        System.out.print(minutes + " minutes is approximately " + minutesToYears + " and " + resultOfDays + " days");

    }
}
