package guviplayset456;
import java.util.*;
import java.util.Scanner;

public class Pgm25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string 1:");
		String s1=sc.nextLine();
		System.out.println("enter the string 2");
		String s2=sc.nextLine();
		int l1=s1.length();
		int l2=s2.length();
		boolean bool=false;
		if(l1==l2)
		 {
		   for(int i=0;i<l1;i++)
		   {
			if(s2.equalsIgnoreCase(s1))
			{
				bool=true;
				continue;
			}
			else
				bool=false;
			}
		   if(bool)
				System.out.println("yes");
			else
				System.out.println("no");
			}
		else
			System.out.println("no");

		 }

	}