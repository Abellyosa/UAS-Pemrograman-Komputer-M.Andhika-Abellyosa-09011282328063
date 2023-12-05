import java.util.Scanner;

public class abellyosa_09011282328063_uas_progkomno2 {
    public static void main(String[] args) {
        // Nilai username dan password yang telah ditentukan
        String usernameTersimpan = "m.andhikaabellyosa";
        String passwordTersimpan = "akusukakeju";

        // Meminta pengguna untuk memasukkan username dan password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa apakah username dan password sesuai dengan nilai yang telah ditentukan
        if (usernameInput.equals(usernameTersimpan) && passwordInput.equals(passwordTersimpan)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}