import java.util.Scanner;
class Aarry{
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element : ");
		for(int i=0;i<arr.length;i++){
	    arr[i]=sc.nextInt();
}
System.out.println("array value are:");
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
	}
}
}