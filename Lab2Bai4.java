package java.pkg01_sd1801;
import java.util.Scanner;

public class Lab2Bai4 {
    public static void menu() {
        // output
        System.out.println("+------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất"); 
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+------------------------------+");
    }
    
    public static void giaiPTBac1() {
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
    
    public static void giaiPTBac2() {
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
    
    public static void tinhTienDien() {
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
        
    
    public static void main(String[] args) {
        menu();
        // input
        int chucNang;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn chức năng: ");
        chucNang = scanner.nextInt();
        
        // thuat toan
        switch (chucNang) {
            case 1:
                giaiPTBac1();
                break;
            case 2:
                giaiPTBac2();
                break;
            case 3:
                tinhTienDien();
                break;
            case 4:
                break;
            default:
                System.out.println("Chức năng không có trong menu.");
        }
    }
    
}
