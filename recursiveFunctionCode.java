import java.util.Scanner;

public class recursiveFunctionCode {

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    System.out.print("Enter a number (decimal allowed):  ");
    while (!scn.hasNextDouble()) {
        System.out.print("Please enter a valid number. ");
        scn.next();
    }
    double x = scn.nextDouble();
    
    System.out.print("Please enter a non-negative whole number for 'n': ");
    while (!scn.hasNextInt()) {
        System.out.print("Please enter a valid whole number. ");
        scn.next();
    }
    int n = scn.nextInt();

    if (n < 0) {
        System.out.println("'n' must be a non-negative whole number. Try again. ");
        return;
    }

    double result = power(x, n);
    System.out.println(x + " raised to the power of " + n + " is: " + result);

    scn.close();
    }

    public static double power(double x, int n){
            if(n == 0){
            return 1;
            }
            double xnm1 = power(x, n - 1);
            double xn = x * xnm1;

        
        return xn;
    }
    
}
