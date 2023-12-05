import java.util.Scanner;

public class abellyosa_09011282328063_uas_progkomno8 {
    private String username;
    private String password;
    private boolean aktif;

    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = true;
    }

    public void tampilkanInfoAkun() {
        System.out.println("Informasi Akun:");
        System.out.println("Username: " + username);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    public void aktifkanAkun() {
        if (!aktif) {
            System.out.println("Akun dengan username '" + username + "' berhasil diaktifkan.");
            aktif = true;
        } else {
            System.out.println("Akun dengan username '" + username + "' sudah aktif sebelumnya.");
        }
    }

    public void nonaktifkanAkun() {
        if (aktif) {
            System.out.println("Akun dengan username '" + username + "' berhasil dinonaktifkan.");
            aktif = false;
        } else {
            System.out.println("Akun dengan username '" + username + "' sudah nonaktif sebelumnya.");
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas AkunPengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        AkunPengguna akun = new AkunPengguna(usernameInput, passwordInput);

        akun.tampilkanInfoAkun();
        akun.nonaktifkanAkun();
        akun.tampilkanInfoAkun();

        akun.aktifkanAkun();
        akun.tampilkanInfoAkun();
    }
}