import java.util.Scanner;

public class ThreeOperations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Please enter real number N1: ");
        double N1 = in.nextDouble();
        System.out.printf("Please enter real number N2: ");
        double N2 = in.nextDouble();
        
        double x = (N1 * N2);
        double d = (N1 / N2);
        double p = Math.pow(N1, N2);
        
        System.out.printf("%.6f * %.6f = %.2f\n", N1, N2, x);
        System.out.printf("%.6f / %.6f = %.2f\n", N1, N2, d);
        System.out.printf("%.6f raised to the power of %.6f = %.2f\n", N1, N2, p);
    }
    
}
