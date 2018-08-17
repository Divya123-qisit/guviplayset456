package guviplayset456;
import java.util.*;
public class Pgm21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int min=arr[0];
for(int i=0;i<n;i++)
{
	if(min>arr[i])
		min=arr[i];
}
int secmin=arr[0];
for(int i=0;i<n;i++)
{
	if(min>arr[i])
		secmin=arr[i];
}
System.out.println(min);
System.out.println(secmin);
	}

}
