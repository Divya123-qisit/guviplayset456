package guviplayset456;
import java.util.*;
public class Pgm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String S;
		int K,i,j;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		S=sc.nextLine();
		K=sc.nextInt();
		char[] array=S.toCharArray();
		for(i=0;i<K;i++)
		{
			temp=array[0];
			array[0]=array[S.length()-1];
			for(j=S.length();j>1;j--)
			{
				array[j-1]=array[j-2];
			}
			array[j]=temp;
		}
		System.out.println(array);
		
	}

}
