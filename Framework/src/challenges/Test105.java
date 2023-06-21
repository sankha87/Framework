package challenges;

import java.util.*;
import java.lang.*;
import java.io.*;

class Test105
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner r=new Scanner(System.in);
		int t=r.nextInt();
		for(int i=0;i<t;i++)
		{
		     int x=r.nextInt();
		     int y=r.nextInt();
		     if(x>y)
		     {
		        if(((x-y)/5)!=0)
		        {
		            System.out.println((x-y));
		        }
		        else
		        {
		            x=x+1;
		            System.out.println(((x-y)/2+1));
		        }
		     }
		     else if(x<y)
		     {
		         System.out.println(y-x);
		     }
		     else
		     {
		         System.out.println(0);
		     }
		    
		}
	}
}
