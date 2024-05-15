package java.pkg01_sd1801;
import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        // input
        double soDien;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện: ");
        soDien = scanner.nextDouble();
        
        // thuat toan
        double tien;
        if (soDien < 50) {
            tien = soDien * 1000;
            // output
            System.out.println("Số tiền = " + tien);
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
            // output
            System.out.println("Số tiền = " + tien);
        }
    }
    
}
