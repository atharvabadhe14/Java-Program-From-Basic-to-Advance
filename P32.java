import java.util.Scanner;
class P32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();
        if (isValidNumber(number)) {
            int sum = calculateSumOfFirstAndLastDigit(number);
            System.out.println("Sum of the 1st and last digit: " + sum);
        } else {
            System.out.println("Please enter a valid 5-digit number.");
        }

        scanner.close();
    }

    static boolean isValidNumber(int number) {
        return number >= 10000 && number <= 99999;
    }

    static int calculateSumOfFirstAndLastDigit(int number) {
        int firstDigit = Character.getNumericValue(Integer.toString(number).charAt(0));
        int lastDigit = number % 10;
        return firstDigit + lastDigit;
    }
}
