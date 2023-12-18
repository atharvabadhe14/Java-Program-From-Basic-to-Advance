import java.util.Scanner;

class P30 {
    public static void main(String[] args) {
        int i, no, fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        no = sc.nextInt();

        for (i = 1; i <= no; ++i) {
            fact = fact * i;
        }

        System.out.println("Factorial of the number is: " + fact);
    }
}
