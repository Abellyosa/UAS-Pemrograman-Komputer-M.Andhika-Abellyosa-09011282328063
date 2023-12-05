import java.util.Scanner;

public class abellyosa_09011282328063_uas_progkomno7 {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public void tampilkanInfoBuku() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        if (dipinjam) {
            System.out.println("Status: Dipinjam");
        } else {
            System.out.println("Status: Tersedia");
        }
    }

    public void pinjamBuku() {
        if (!dipinjam) {
            System.out.println("Buku dengan judul '" + judul + "' berhasil dipinjam.");
            dipinjam = true;
        } else {
            System.out.println("Buku dengan judul '" + judul + "' sudah dipinjam sebelumnya.");
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Buku
        Buku buku1 = new Buku("Java Programming", "John Doe", 2020);
        Buku buku2 = new Buku("Python Basics", "Jane Smith", 2019);

        buku1.tampilkanInfoBuku();
        buku1.pinjamBuku();
        buku1.tampilkanInfoBuku();

        buku2.tampilkanInfoBuku();
        buku2.pinjamBuku();
    }
}