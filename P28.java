import java.util.Scanner;
class P28
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int no = in.nextInt();
        int tno=no;//copy
        int sum=0;
        while(tno>0)
        {
            int digit=tno%10;
            tno=tno/10;
            sum=sum+digit*digit*digit;
            
        }
        if(sum==no)
            System.out.println(no+" is armstrong");
        else
            System.out.println(no+" is not armstrong");
    }
}