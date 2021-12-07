import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int coordinate = inp.nextInt();

        System.out.print("Coordinate of 1st point: ");
        int firstPoint = inp.nextInt();

        System.out.print("Coordinate of 2nd point: ");
        int secondPoint = inp.nextInt();

        int result = firstPoint - coordinate;
        int secondResult = secondPoint - coordinate;

        if (result < 0) {
            result = -result;
        } else if (secondResult < 0) {
            secondResult = -secondResult;
        }

        if (result < secondResult) {
            System.out.println("1st point is closer. Distance " + result);
        } else if (result > secondResult) {
            System.out.println("2nd point is closer. Distance " + secondResult);
        } else {
            System.out.println("distance is the same. It is " + result);
        }
    }
}
