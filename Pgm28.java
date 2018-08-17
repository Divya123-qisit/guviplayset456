package guviplayset456;
import java.util.*;
public class Pgm28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String s1=sc.nextLine();
String[] ch=s1.split(" ");
System.out.println("enter the word to checkmavail or not");
String s2=sc.nextLine();
int count=1;
for(int i=0;i<ch.length;i++)
{
	if(ch[i]==s2)
		{count++;
	break;}
	else
		continue;
}
System.out.println(count);
	}

}
