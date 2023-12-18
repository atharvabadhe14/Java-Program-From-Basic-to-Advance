import java.util.Scanner;

class P35 {
    public static void main(String[] args) {
        double i, x, n, sum = 1, no, fact;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = sc.nextInt();

        System.out.print("Enter range: ");
        n = sc.nextInt();

        for (i = 1; i <= n; ++i) {
            no = i;
            fact = 1;

            while (no > 0) {
                fact = fact * no;
                --no;
            }
            sum = sum + (Math.pow(x, i) / fact);
        }

        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
