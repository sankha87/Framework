package challenges;
import java.util.Scanner;

// second largest of 3 nos.

class Test110
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
				   
				     if(x>y && x>z)			// x - largest
				     {
				    	 if(y>z)
				    		 System.out.println(y);
				    	 else
				    		 System.out.println(z);
				     }
				     else if(y>x && y>z)	// y - largest
				     {
				    	 if(x>z)
				    		 System.out.println(x);
				    	 else
				    		 System.out.println(z); 
				     }
				     else					// z - largest 			
				     {
				    	 if(x>y)
				    		 System.out.println(x);
				    	 else
				    		 System.out.println(y);
				     }
				}
		}
}
