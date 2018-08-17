package guviplayset456;
import java.util.*;
public class Pgm26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s1=sc.nextLine();
System.out.println("enter the character values");
char ch=sc.next().charAt(0);
int pos=0;
for(int i=0;i<s1.length();i++)
{
	if(s1.charAt(i)==ch)
	{
		pos=i;
	break;
	}
	else
		continue;
}
System.out.println(pos+1);
	}

}
