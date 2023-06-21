package challenges;
import java.util.Scanner;
// codechef example

class Test101
{
	public static void main (String[] args) throws java.lang.Exception
	{
	System.out.print("enter no of test cases : ");
    Scanner sc = new Scanner(System.in);
    int text =sc.nextInt();
    
    System.out.println("enter a and b : ");
    while (text>0) {
	    int a =sc.nextInt(); 
	    int b=sc.nextInt();  
	    double c=(a*b);        
	    int d=(int) (Math.ceil(c/4));           
	    System.out.println(d);
	}
	}
}

/*
 * There are N batsmen in a cricket academy and each needs
A bats for practice. Each kit contains 4 bats.
What is the minimum number of kits that the academy should order so everyone gets sufficient bats for practice?
Input Format -
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two integers -
N and A
Output Format -
For each test case, output the minimum number of kits that the academy should order.
Constraints ---
1≤T≤100
1≤N, A≤10

Sample 1:
Input -
2
2 5
3 6
Output -
3
5
*/