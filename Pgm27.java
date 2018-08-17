package guviplayset456;
import java.util.*;
public class Pgm27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s1=sc.nextLine();
System.out.println("enter the charcter to occur in string");
char ch=sc.next().charAt(0);
int count=0;
for(int i=0;i<s1.length();i++)
	if(s1.charAt(i)==ch)
	{	count++;
break;
	}
	else
		continue;
System.out.println(count);

}
}
