import java.util.Scanner;
class P12
{
	public void voting(){
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc1.nextInt();
		if(age>=18){
			System.out.println("Eligible for vote : "+age);
		}
		if(age<18){
			System.out.println("Not Eligible for vote : "+age);

		}
		
		
	}
	public static void main(String[] args) {
		P12 m=new P12();
		m.voting();
	}

	}