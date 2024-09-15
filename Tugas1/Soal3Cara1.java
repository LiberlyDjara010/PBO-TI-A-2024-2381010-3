package Tugas1;
import java.util.Scanner;

public class Soal3Cara1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata dalam format camelCase: ");
        String camelCase = scanner.nextLine();

        int jumlahKata = 1;

        for (int i = 0; i < camelCase.length(); i++) {
            if(Character.isUpperCase(camelCase.charAt(i))) {
                jumlahKata++;
            }
        }
        System.out.println("Jumlah kata dalam '" + camelCase + "' adalah: " + jumlahKata);

        scanner.close();
    }
}
