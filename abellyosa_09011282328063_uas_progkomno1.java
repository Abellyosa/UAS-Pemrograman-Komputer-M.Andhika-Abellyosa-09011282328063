import java.util.Scanner;

public class abellyosa_09011282328063_uas_progkomno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        System.out.print("Masukkan harga barang per unit: ");
        double hargaPerUnit = scanner.nextDouble();

        double totalHarga;

        if (jumlahBarang < 5) {
            totalHarga = jumlahBarang * hargaPerUnit;
        } else if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            totalHarga = jumlahBarang * hargaPerUnit * 0.95; // Diskon 5%
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            totalHarga = jumlahBarang * hargaPerUnit * 0.9; // Diskon 10%
        } else {
            totalHarga = jumlahBarang * hargaPerUnit * 0.8; // Diskon 20%
        }

        System.out.println("Total harga setelah diskon: " + totalHarga);
    }
}