package guviplayset456;
import java.util.*;
public class Pgm23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
int count=0;
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
	if(ch[i]!=' ')
		count++;
	System.out.println(count);
	}

}
