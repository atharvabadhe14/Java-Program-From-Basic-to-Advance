import java.util.Scanner
Class note{
	public static void main(String[] args) {
		int amt,n;
		Scanner sc=new Scanner(System.in)
		System.out.println("Enter amount :");
		int amt=sc.NextInt();
		system.out.println("Enter range");
		int n=sc.NextInt();
		switch(note){
		case 100:
			a=amt/100;
			system.out.println("Rs 100 notes are"+a);
			amt%=100;
		case 50:
			a=amt/50;
			system.out.println("Rs 50 notes are"+a);
			amt%=50;
		case 20:
			a=amt/20;
			system.out.println("Rs 20 notes are"+a);
			amt%=20;
		case 10:
			a=amt/100;
			system.out.println("Rs 10 notes are"+a);
			amt%=100;
		case 5:
			a=amt/5;
			system.out.println("Rs 5 notes are"+a);
			amt%=5;
		case 2:
			a=amt/2;
			system.out.println("Rs 2 notes are"+a);
			amt%=2;
		case 1:
			a=amt/1;
			system.out.println("Rs 1 notes are"+a);
			amt%=1;
		    break;
	    default:
	     	system.out.println("Invalid input")

		}
	}
}