import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = keyboardInput.nextLine();

        System.out.println("How old are you?");
        int age = keyboardInput.nextInt();

        System.out.println("Hey," + name + "You are " + age + "old");
    }
}
