package guviplayset456;
import java.util.*;
public class Pgm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,K,count=0,temp=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the numbers:");
		N=sc.nextInt();
		K=sc.nextInt();
		while(N!=0)
		{
			if(N%K==1)
			{
				count++;
			}
			N/=K;
		}
		if(count==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
