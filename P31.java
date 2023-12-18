import java.util.Scanner;
class P31 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to 20: " + sum);
    }
}
