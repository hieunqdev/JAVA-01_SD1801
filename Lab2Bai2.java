package java.pkg01_sd1801;
import java.util.Scanner;
import java.lang.Math;

public class Lab2Bai2 {
    public static void main(String[] args) {
        // input
        double a;
        double b;
        double c;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        a = scanner.nextDouble();
        System.out.println("nhap b: ");
        b = scanner.nextDouble();
        System.out.println("nhap c: ");
        c = scanner.nextDouble();
        
        // thuat toan
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            // output
            System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            // output
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
    }
    
}

