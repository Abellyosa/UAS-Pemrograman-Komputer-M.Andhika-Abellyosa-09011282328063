import java.util.Stack;

public class abellyosa_09011282328063_uas_progkomno9 {
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '[' || karakter == '{') {
                stack.push(karakter);
            } else if (karakter == ')' || karakter == ']' || karakter == '}') {
                if (stack.isEmpty()) {
                    return false; // Kurung tutup tanpa pasangan kurung buka
                }

                char kurungBuka = stack.pop();
                if (!pasanganKurung(kurungBuka, karakter)) {
                    return false; // Tidak sesuai pasangan kurung
                }
            }
        }

        return stack.isEmpty(); // Jika stack kosong, urutan kurung benar
    }

    private static boolean pasanganKurung(char kurungBuka, char kurungTutup) {
        return (kurungBuka == '(' && kurungTutup == ')') ||
               (kurungBuka == '[' && kurungTutup == ']') ||
               (kurungBuka == '{' && kurungTutup == '}');
    }

    public static void main(String[] args) {
        String ekspresi1 = "((a + b) * (c - d))";
        String ekspresi2 = "{[a + b] * (c - d)}";
        String ekspresi3 = "(a + b) * (c - d))";

        System.out.println("Ekspresi 1: " + cekUrutanKurung(ekspresi1));
        System.out.println("Ekspresi 2: " + cekUrutanKurung(ekspresi2));
        System.out.println("Ekspresi 3: " + cekUrutanKurung(ekspresi3));
    }
}