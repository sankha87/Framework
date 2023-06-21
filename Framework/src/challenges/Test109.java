package challenges;
import java.util.Scanner;
// largest of 3 nos.

class Test109
{
	public static void main (String[] args) throws java.lang.Exception
			{
				Scanner r=new Scanner(System.in);
				int t=r.nextInt();
				for(int i=0;i<t;i++)
				{
				     int x=r.nextInt();
				     int y=r.nextInt();
				     int z=r.nextInt();
				   
				     if(x>y)
				     {
				    	 if(x>z)
				    		 System.out.println(x);
				    	 else
				    		 System.out.println(z);
				     }
				     else	// x<y
				     {
				    	 if(y>z)
				    		 System.out.println(y);
				    	 else
				    		 System.out.println(z); 
				     }
				}
		}
}