import java.util.Scanner;
class P34{
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 5000:");

        for (int number = 1; number <= 5000; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    static boolean isArmstrong(int num) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = num;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = num;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        return result == num;
    }
}
