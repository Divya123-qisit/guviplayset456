package guviplayset456;
import java.util.*;
public class Pgm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int len1=s1.length();
int len2=s2.length();
if(s2.equals(s1.substring(len2)))
	System.out.println("yes");
else
	System.out.println("no");
	}

}
