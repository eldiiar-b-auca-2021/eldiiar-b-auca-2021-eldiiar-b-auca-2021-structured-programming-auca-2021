import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Year? ");
        int year = inp.nextInt();
        if (year < 1) {
            System.out.println(year + " is not a correct year");
            System.exit(1);
        }

        System.out.print("Month? ");
        int month = inp.nextInt();
        if (month < 1 || month > 12) {
            System.out.println(month + " is not a correct number of month");
            System.exit(2);
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The number of month: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The number of month: 30");
                break;
            case 2:
                boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
                System.out.println(isLeapYear ? 29 : 28);
                break;
        }

        }
    }
