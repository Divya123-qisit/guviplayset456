package guviplayset456;
import java.util.*;
public class Pgm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=2;i<=n;i++)
{
	if(i%2==0)
	{
		if(n%i==0)
			System.out.println(i);
	}
}
	}

}
