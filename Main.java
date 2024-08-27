/*
In Chefland, a valid phone number consists of 5  digits with no leading zeros.
For example, 98765,10000  and 71023  are valid phone numbers while 04123,9231  and 872310  are not.

Chef went to a store and purchased N  items, where the cost of each item is X .
Find whether the total bill is equivalent to a valid phone number.

Input Format:

The first line of input will contain a single integer T , denoting the number of test cases.
Each test case consists of two space-separated integers NN and X  — the number of items Chef bought and the cost per item.

Output Format:

For each test case, output on a new line, YES, if the total bill is equivalent to a valid phone number and NO otherwise.

 
Constraints:

1≤T≤100
1≤N,X≤1000 


Test Case:
Input:
2
35 456
25 98

Output:
Yes
No

*/

import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner x= new Scanner(System.in);
		int a;
		a=x.nextInt();
		int arr1[]=new int[a*2];
		for(int i=0;i<a*2;i++){
		    arr1[i]=x.nextInt();
		    if(i%2!=0){
		        String s=Integer.toString(arr1[i]*arr1[i-1]);
		        if(s.length() == 5){
		            System.out.println("Yes");
		        }
		        else{
		            System.out.println("No");
		        }
		    }
		    
		}
		

	}
}
