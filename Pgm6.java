package guviplayset456;
import java.util.*;
public class Pgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int a=0;
int count=0;
while(n>0)
{
	a=n%10;
	if(a==k) {
		count=count+1;
	}
	n=n/10;
}
System.out.println(count);
	}

}
