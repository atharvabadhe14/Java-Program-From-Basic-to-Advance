import java.util.Scanner;
class P11
{
	public void number(){
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter number: ");
		int no=sc1.nextInt();
		if(no>0){
			System.out.println("number is postive : "+no);
		}
		if(no<0){
			System.out.println("number is negative : "+no);

		}
		if (no==0){
			System.out.println("number is zero : ");
		}
	}
	public static void main(String[] args) {
		P11 m=new P11();
		m.number();
	}

	}