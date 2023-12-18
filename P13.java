import java.util.Scanner;
class P13
{
	public void number(){
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter number: ");
		int no=sc1.nextInt();
		if(no%2==0){
			System.out.println("number is even : "+no);
		}
		if(no%2!==0){
			System.out.println("number is odd : "+no);

		}
		
	}
	public static void main(String[] args) {
		P13 m=new P13();
		m.number();
	}

	}