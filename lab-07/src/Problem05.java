import java.util.*;

public class Problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int a = in.nextInt();
        System.out.print("Enter " + a + " scores: ");
        int[] num = new int[a];
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
            if (num[i] > max)  {
                max = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (max - 10 <= num[i]) {
                System.out.println("Student " + i + " score is A");
            } else if (max - 20 <= num[i]) {
                System.out.println("Student " + i + " score is B");
            } else if (max - 30 <= num[i]) {
                System.out.println("Student " + i + " score is C");
            } else if (max - 40 <= num[i]){
                System.out.println("Student " + i + " score is D");
            } else {
                System.out.println("Student " + i + " score is F");
            }
        }
    }
}
