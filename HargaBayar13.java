import java.util.Scanner;

public class HargaBayar13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHal;
        double dis , total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan Merk Buku yang Dibeli : ");
        merkBuku= input.next();

        System.out.println("Masukkan Jumlah Halaman Buku : ");
        jmlHal= input.nextInt();

        System.out.println("Masukkan Harga Barang yang Dibeli : ");
        harga= input.nextInt();

        System.out.println("Masukkan Jumlah Barang yang Dibeli : ");
        jumlah = input.nextInt();

        System.out.println("Diskon : ");
        dis= input.nextDouble();

        total = harga*jumlah;
        jmlDis = total*dis;

        bayar = total - jmlDis;

        System.out.println("Diskon yang Anda Dapatkan Adalah " + jmlDis);
        System.out.println("Jumlah yang Harus Dibayar Adalah " + bayar);
    }
}