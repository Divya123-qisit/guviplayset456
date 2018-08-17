package guviplayset456;
import java.util.*;
public class Pgm22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int n=sc.nextInt();
System.out.println("enter the array element");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("enter the position");
int k=sc.nextInt();
int temp=0;
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
	if(arr[i]>arr[j])
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	}
}
System.out.println(arr[k-1]);
	}

}
