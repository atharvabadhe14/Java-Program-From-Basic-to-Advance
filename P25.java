import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		int no, rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=sc.nextInt();

		while(no>0)
		{
			rev=no%10;
			++no;

		}
		System.out.println("count of number is "+rev);
	}
}