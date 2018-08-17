package guviplayset456;
import java.util.*;
public class Pgm20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean bool=false;
for(int i=2;i<=n;i++)
{
	if(n%i==0)
		bool=true;
	else
		continue;
}
if(!bool)
	System.out.println("no");
else
	System.out.println("yes");
	}

}
