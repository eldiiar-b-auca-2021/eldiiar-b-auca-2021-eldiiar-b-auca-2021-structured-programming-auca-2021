public class Problem01 {
    public static void main(String[] args) {
        double x = 0.0;

        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        double a = (x - 1.0);


        if (Math.abs(x - 1.0) < 1E-10) {
           System.out.println("Ok");
        } else {
            System.out.println("What?!!!");
            System.out.println(x);
        }

    }
}
