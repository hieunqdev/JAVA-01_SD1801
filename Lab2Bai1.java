package java.pkg01_sd1801;
import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        // input
        double a;
        double b;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        a = scanner.nextDouble();
        System.out.println("nhap b: ");
        b = scanner.nextDouble();
        
        // thuat toan
        if (a == 0) {
            if (b == 0) {
                // output
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                // output
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b/a;
            // output
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
    
}
