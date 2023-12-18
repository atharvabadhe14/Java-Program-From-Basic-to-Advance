import java.util.Scanner;
class PalindromeP29
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int no = in.nextInt();
        int tno=no;
        int rno=0;
        while(tno>0)
        {
            int digit=tno%10;
            tno=tno/10;
            rno=rno*10+digit;
            System.out.println("No:"+tno+"\trno:"+rno);
        }
        if(rno==no)
            System.out.println(no+"yes");
        else
            System.out.println(no+"no");
}
}