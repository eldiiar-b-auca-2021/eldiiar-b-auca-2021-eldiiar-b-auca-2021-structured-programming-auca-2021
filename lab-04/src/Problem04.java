import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Complexity level? ");
        int level = inp.nextInt();

        switch (level) {
            case 4:
            case 5:
                System.out.println("You are pro gamer.");
                break;
            case 2:
            case 3:
                System.out.println("You are experienced gamer.");
                break;
            case 1:
                System.out.println("You are a beginner.");
                break;
            case 0:
                System.out.println("You are total newbie");
                break;
            default:
                System.out.println(level + " it is incorrect of level");
        }
    }
}
