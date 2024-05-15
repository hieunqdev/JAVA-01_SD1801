package java.pkg01_sd1801;
import java.util.Scanner;
import java.lang.Math;

public class Lab1Bai4 {
    public static void main(String[] args) {
        // input
        double a;
        double b;
        double c;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a = ");
        a = scanner.nextDouble();
        System.out.println("nhap b = ");
        b = scanner.nextDouble();
        System.out.println("nhap c = ");
        c = scanner.nextDouble();
        
        // thuat toan
        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);
        
        // output
        System.out.println("can delta = " + canDelta);
    }    
}
