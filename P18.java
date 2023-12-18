import java.util.scanner
Class P18{
	public static void main(String[] args) {
		scanner sc=new scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.NextInt();
		switch(n){
		case 1:System.out.println("one")
			break;
		case 2:System.out.println("two")
			break;
		case 3:System.out.println("three")
			break;
		case 4:System.out.println("four")
			break;
		
		default:System.out.println("invalid input")
		}
	}
}
