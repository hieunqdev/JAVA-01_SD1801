package java.pkg01_sd1801;
import java.util.Scanner;
import java.lang.Math;

public class Lab1Bai3 {
    public static void main(String[] args) {
        // input
        double doDaiCanh;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai canh: ");
        doDaiCanh = scanner.nextDouble();
        
        // thuat toan
        double theTich = Math.pow(doDaiCanh, 3);
        
        // output
        System.out.println("the tich = " + theTich);
    }
    
}
