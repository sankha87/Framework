package challenges;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test103
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t; i++)
		{
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int d = scan.nextInt();
		    if(a+c==180 && b+d==180)
		    {
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}