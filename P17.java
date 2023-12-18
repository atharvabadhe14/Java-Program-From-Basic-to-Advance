import java.util.Scanner;
class pro{
	public static void main(String[] args) {
		double m1=80,m2,m3,m4,total,per;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks : ");
		m1=c.nextInt();
		System.out.println("Enter marks : ");
		m2=c.nextInt();
		System.out.println("Enter marks : ");
		m3=c.nextInt();
		System.out.println("Enter marks : ");
		m4=c.nextInt();
		int total=m1+m2+m3+m4;
		if (per>=85){
			System.out.println("grade:A");
		}
		else if(per>=75&&per<85){
			System.out.println("grade:B");
		}
		else if(per>=50&&per<75){
			System.out.println("grade:C");
		}
		else if(per>=40&&per<50){
			System.out.println("grade:D");
		}
        else {
			System.out.println("grade:E");
        }

	}
		
		public static void main(String[] args) {
		Pro m = new Pro();
		m.grade();
	}
}
