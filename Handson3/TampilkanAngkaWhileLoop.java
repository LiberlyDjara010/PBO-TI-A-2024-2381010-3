package Handson3;

public class TampilkanAngkaWhileLoop {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 20) {
            if (i % 3 == 0) {
                i++;
            }
            if (i > 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}