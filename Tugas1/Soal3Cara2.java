package Tugas1;

public class Soal3Cara2 {
    public static void main(String[] args) {
        String camelCase = "saveChangesInTheEditor";

        int jumlahKata = 1;

        for (int i = 0; i < camelCase.length(); i++) {
            if(Character.isUpperCase(camelCase.charAt(i))) {
                jumlahKata++;
            }
        }

        System.out.println("jumlah kata dalam camelCase: " + jumlahKata);
    }
}