package java.pkg01_sd1801;
import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        // input
        double chieuDai;
        double chieuRong;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        chieuDai = scanner.nextDouble();
        System.out.println("nhap chieu rong: ");
        chieuRong = scanner.nextDouble();
        
        // thuat toan
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        
        // ouput
        System.out.println("chu vi = " + chuVi);
        System.out.println("dien tich = " + dienTich);
        System.out.println("canh nho = " + chieuRong);
    }
    
}
