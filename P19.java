import java.util.Scanner;
class Calculator{
	
		int r,l,w,a,b;
		final float PI=3.14f;
		Scanner sc=new Scanner(System.in);
	public void areaOfcircle(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float area=PI*r*r;
	    System.out.println("area of circle is:"+area);
   
	}
	public void circumferenceOfCircle(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float circumferenceOfCircle=2*PI*r;
	    System.out.println("cir of circle"+circumferenceOfCircle);
	}
    public void areaOfRectangle(){
        System.out.println("Enter value of :");
        l=sc.nextInt();
        System.out.println("Enter value of :");
        w=sc.nextInt();
	    float areaOfRectangle=l*w;
	    System.out.println("area of rectangle : "+areaOfRectangle);
	}
	public void volumeOfSphere(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float volumeOfSphere=(4/3)*PI*r*r*r;
	    System.out.println("volume of sphere : "+volumeOfSphere);
    }
    public void surfaceAreaOfSphere(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float surfaceAreaOfSphere=4*PI*r*r;
	    System.out.println("surface area of sphere :"+surfaceAreaOfSphere);
	}
	public void areaOfSquare(){
        System.out.println("Enter value of :");
        r=sc.nextInt();
	    float areaOfSquare=r*r;
	    System.out.println("area of square : "+areaOfSquare);

	}
	public void areaOfRightAngleTriangle(){
        System.out.println("Enter value of :");
        a=sc.nextInt();
        System.out.println("Enter value of :");
        b=sc.nextInt();
	    float areaOfRightAngleTriangle=(a*b)/2;
	    System.out.println("cir of circle"+areaOfRightAngleTriangle);
	}
	public void areaOfEquilateralTriangle(){
        System.out.println("Enter value of :");
        a=sc.nextInt();
	    float areaOfEquilateralTriangle=((3^1/2)/4)*a*a;
	    System.out.println("cir of circle"+areaOfEquilateralTriangle);
	}
	public void perimeterOFRectangle(){
        System.out.println("Enter value of :");
        a=sc.nextInt();
        System.out.println("Enter value of :");
        b=sc.nextInt();
	    float perimeterOFRectangle=(a+b)*2;
	    System.out.println("cir of circle"+perimeterOFRectangle);
	}
	public void areaOfTriangle(){
        System.out.println("Enter value of :");
        a=sc.nextInt();
        System.out.println("Enter value of :");
        b=sc.nextInt();
	    float areaOfTriangle=(a*b)*1/2;
	    System.out.println("cir of circle"+areaOfTriangle);
    
 	}

    public static void main(String[] args) {
		Calculator c=new Calculator();
		Scanner sc1=new Scanner(System.in);
		while(true){
			System.out.println("1.area of circle");
			System.out.println("2.circumferenceOfCircle");
			System.out.println("3.areaOfRectangle");
			System.out.println("4.volumeOfSphere");
			System.out.println("5.surfaceAreaOfSphere");
			System.out.println("6.surfaceAreaOfSphere");
			System.out.println("7.areaOfRightAngleTriangle");
			System.out.println("8.areaOfEquilateralTriangle");
			System.out.println("9.perimeterOFRectangle");
			System.out.println("10.areaOfTriangle");
			System.out.println("11.exit");
			System.out.println("select any choice: ");
			int ch=sc1.nextInt();
		    switch(ch){
			case 1: c.areaOfcircle();
				break;
			case 2:c.circumferenceOfCircle();
				break;
			case 3:c.areaOfRectangle();
				break;
			case 4:c.volumeOfSphere();
				break;
			case 5:c.surfaceAreaOfSphere();
				break;
		    case 6:c.areaOfSquare();
		    	break;
			case 7:c.areaOfRightAngleTriangle();
				break;
			case 8:c.areaOfEquilateralTriangle();
				break;
			case 9:c.perimeterOFRectangle();
				break;
			case 10:c.areaOfTriangle();
				break;
		    case 11:System.exit(0);
		    	break;
		    default: System.out.println("invalid command");
		    }
}
}
}