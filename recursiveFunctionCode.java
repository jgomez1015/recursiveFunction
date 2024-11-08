import java.util.Scanner;

public class recursiveFunctionCode {

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    System.out.print("Enter a number (whole # only):  ");
    while (!scn.hasNextInt()) {
        System.out.print("Please enter a valid whole number. ");
        scn.next();
    }
    int x = scn.nextInt();
    
    System.out.print("Please enter another whole number for 'n': ");
    while (!scn.hasNextInt()) {
        System.out.print("Please enter a valid whole number. ");
        scn.next();
    }
    int n = scn.nextInt();
    
    int xn = power(x, n);
    System.out.println(xn);

    scn.close();
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1; 
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
}
