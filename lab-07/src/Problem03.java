import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N: ");
        int n = inp.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " element: ");
            a[i] = inp.nextInt();
        }
        System.out.println("Before reversing");
        printArray(a);
        System.out.println("After reversing");
        reverseArray(a);
        printArray(a);
    }
    private static void reverseArray(int[] a) {
        int left = 0;
        int right = a.length-1;
        while (left < right) {
            int t = a[left];
            a[left] = a[right];
            a[right] = t;
            left++;
            right--;
        }
    }
    private static void printArray (int [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
