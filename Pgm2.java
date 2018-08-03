package guviplayset456;
import java.util.*;
public class Pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
	arr[i]=sc.nextInt();
int selem=sc.nextInt();
boolean bool=false;
for(int i=0;i<size;i++)
{
	if(arr[i]!=selem)
		continue;
	else
		bool=true;
}
if(bool)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
