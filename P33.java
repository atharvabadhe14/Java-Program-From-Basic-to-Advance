import java.util.Scanner;
class P33{
	public static void main(String[] args) {
		int i,n,f0=0,f1=1,f2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any range of any Fibonacci series :");
		n=sc.nextInt();
		System.out.println(f0+"\t"+f1);
		for (i=3;i<=n ;++i ) {
			f2=f0+f1;
			System.out.println("\t"+f2);
			f0=f1;
			f1=f2;
			
		}
		}
	}