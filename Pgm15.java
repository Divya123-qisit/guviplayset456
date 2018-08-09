package guviplayset456;
import java.util.*;
public class Pgm15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
	        int P=in.nextInt(),l=0,b=0;
	        int A=in.nextInt();
	        P /= 2;
	        int a=P/2,flag=0;
	        for(int i=0;i<=P/2;i++)
	        {
	            if(i+a==P && i*a==A)
	            {
	                flag=1;
	                l=i;
	                b=a;
	            }
	            a--;
	        }
	        if(flag!=0)
	            System.out.println("yes");
	        else
	                System.out.println("no");


	}

}
