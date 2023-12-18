import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		int no, sum=0, rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			sum+=rem;
			no=no/10;
		}
		System.out.println("sum of number is "+sum);
	}
}