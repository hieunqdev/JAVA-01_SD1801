package java.pkg01_sd1801;
import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        // input
        String hoVaTen;
        double diemTrungBinh;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ho va ten: ");
        hoVaTen = scanner.nextLine();
        System.out.println("nhap diem trung binh");
        diemTrungBinh = scanner.nextDouble();
        
        // thuat toan
        
        //output
        System.out.println(hoVaTen + " " + diemTrungBinh + " diem");   
    }   
}