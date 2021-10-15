public class Problem09 {
    public static void main(String[] args) {
        double initial =(1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double pi1 = 4*initial;
        double pi2 = 4*(initial+1.0/13);
        System.out.printf("%.3f %.3f",pi1,pi2);
    }
}
