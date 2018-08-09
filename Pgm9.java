package guviplayset456;
import java.util.*;
public class Pgm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	 int a,b,f=0;     
	      a=s.nextInt();
      while(a!=1){
      if(a%2!=0){
                 f=1;
            }
            a=a/2;
           }
        if(f==1){
            System.out.println("No");
        }
    else{
           System.out.println("Yes");
     }
	}

}
