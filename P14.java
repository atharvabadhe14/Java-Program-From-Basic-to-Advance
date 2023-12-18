import java.util.Scanner;
class P14
{
	public void marks(){

		int p1,p2,p3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of : ");
		p1=sc.nextInt();
		System.out.println("Enter marks of : ");
		p2=sc.nextInt();
		System.out.println("Enter marks of : ");
		p3=sc.nextInt();
        
		if(p1<34 && p2<34 || p3<34){
			System.out.println("fail");
		}
		else{
			System.out.println("pass");
		}
	} 
	    public void total(){
	    	int res=p1+p2+p3;
	    	int per=res/3;
	    System.out.println("total marks is : "+per);
    
    	public void gender(){
    		Scanner sc1= new Scanner(System.in);
		    System.out.println("Enter gender : ");
		    char gender=sc1.next().charAt(0);
		    
    	
    	if (per>=82 && gender=='M')
    	
    		System.out.println("He can take admission");
    	
    	else 
    		System.out.println("hr can't take admission");
    	}
    
    

}
	public static void main(String[] args) {
		P14 m=new P14();
		m.marks();
	}

	}