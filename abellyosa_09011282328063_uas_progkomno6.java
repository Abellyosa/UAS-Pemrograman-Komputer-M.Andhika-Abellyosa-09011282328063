import java.util.Scanner;

public class abellyosa_09011282328063_uas_progkomno6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrom(input)) {
            System.out.println("Ya, '" + input + "' adalah palindrom.");
        } else {
            System.out.println("Tidak, '" + input + "' bukan palindrom.");
        }
    }

    public static boolean isPalindrom(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}