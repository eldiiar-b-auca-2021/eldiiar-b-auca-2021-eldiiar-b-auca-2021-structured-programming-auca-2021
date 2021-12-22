public class Problem09 {
    public static void main(String[] args) {
        System.out.println("i             m(i)");
        System.out.println("___________________");
        for (double i = 1; i <= 901; i+=100){
            System.out.printf("%.0f",i);
            System.out.printf("          %.4f\n",m(i));
        }
    }
    static double m(double i){
        double res = 0;
        for (double j = 1; j <= i; j++) {
            res += Math.pow(-1,j+1)/((2*j)-1);
        }
        res*=4;
        return res;
    }

}
