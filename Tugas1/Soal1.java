package Tugas1;

public class Soal1 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7};
        int sum = 0;
        int i = 0;

        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);

        System.out.println("Jumlah elemen: " + sum);
    }
}
