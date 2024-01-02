import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();

        // Segitiga siku-siku
        System.out.println("Segitiga Siku-siku:");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Segitiga terbalik
        System.out.println("Segitiga Terbalik:");
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Segitiga sama kaki
        System.out.println("Segitiga Sama Kaki:");
        for (int i = 1; i <= tinggi; i++) {
            // Spasi
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print("  ");
            }
            // Bintang
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}

