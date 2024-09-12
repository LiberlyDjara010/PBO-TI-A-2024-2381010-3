package Handson3;

public class TampilkanAgkaForEach {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for(int num : numbers){
            if (num % 3 == 0) {
                continue;
            }
            if (num > 15){
                break;
            }
            System.out.println(num);
        }
    }
}
