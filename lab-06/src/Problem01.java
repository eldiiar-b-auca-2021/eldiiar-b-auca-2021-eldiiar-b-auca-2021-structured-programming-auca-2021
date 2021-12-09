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

        int result = auAbs(coordinate, firstPoint);
        int secondResult = auAbs(coordinate, secondPoint);

        if (result < secondResult) {
            System.out.println("1st point is closer. Distance " + result);
        } else if (result > secondResult) {
            System.out.println("2nd point is closer. Distance " + secondResult);
        } else {
            System.out.println("distance is the same. It is " + result);
        }
    }

    private static int auAbs(int coordinate, int firstPoint) {
        int result = firstPoint - coordinate;
        if (result < 0) {
            result = -result;
        }
        return result;
    }
}
