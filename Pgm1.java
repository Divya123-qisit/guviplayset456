package guviplayset456;
import java.util.*;
public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='('||s.charAt(i)==')')
		count++;
}
if(count%2==0)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
