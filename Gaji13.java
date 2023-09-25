import java.util.Scanner;

public class Gaji13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk , jmltdkMasuk, TotGaji;
        int gaji = 50000, potGaji = 50000;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();

        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja : ");
        jmltdkMasuk = input.nextInt();

        TotGaji = (jmlMasuk*gaji)-(jmltdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah" + TotGaji);
    }
}