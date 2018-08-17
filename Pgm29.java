package guviplayset456;
import java.util.*;
public class Pgm29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string 1");
String s1=sc.nextLine();
System.out.println("enter the string 2");
String s2=sc.nextLine();
int l1=s1.length();
int l2=s2.length();
int len=0;
if(l1>l2)
	len=l1;
else
	len=l2;
boolean bool=false;
for(int i=0;i<len;i++)
{
	if(s1.charAt(i)==s2.charAt(i))
		{bool=true;
	break;
		}
	else
		continue;
}
if(bool)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
