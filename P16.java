import java.util.Scanner;

class Year
{
	public void year()
	{
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year : ");
		year=sc.nextInt();
		if(year%100!=0)
			{
			if(year%4==0)
				System.out.println("Is not century leap year"+year);
			else
				System.out.println("Is century leap year"+year); 
			}
		else{
			if(year%400==0)
				System.out.println("Is century leap year"+year);
			else
				System.out.println("Is not leap year"+year);
		}

	}
	public static void main(String[] args) {
		Year m=new Year();
		m.year();
	}
}