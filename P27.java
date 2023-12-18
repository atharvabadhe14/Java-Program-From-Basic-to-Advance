import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		int no, fac=1, rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=sc.nextInt();
		while(no>0)
		{
		
			fac=*no;
			--no;
		}
		System.out.println("factor of number is: "+fac);
	}
}