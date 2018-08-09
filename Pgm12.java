package guviplayset456;
import java.util.*;
public class Pgm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int i,j,count=0;
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[j]<arr[i])
        {
       ++count;
       break;
        }
}
}
if(count==0)
	System.out.println("yes");
else 
System.out.println("no");


	}

}
