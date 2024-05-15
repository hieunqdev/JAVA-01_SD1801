package java.pkg01_sd1801;
import java.util.Scanner;

public class Lab2Bai5 {
    public static void main(String[] args) {
        // input
        double a;
        double b;
        double c;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a: ");
        a = scanner.nextDouble();
        System.out.println("nhập b: ");
        b = scanner.nextDouble();
        System.out.println("nhập c: ");
        c = scanner.nextDouble();
        
        // thuat toan
        double max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        
        // output
        System.out.println("Số lớn nhất là: " + max);
    }
    
}
