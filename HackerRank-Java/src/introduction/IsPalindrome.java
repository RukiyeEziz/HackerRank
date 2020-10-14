package introduction;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Given a string A, print Yes if it is a palindrome, print No otherwise.");
		System.out.println("Enter a string: ");
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        if(checkPalindrome(A)) {
        	System.out.println("Yes");
        }
        else
        	System.out.println("No");
        
	}

	private static boolean checkPalindrome(String a) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		//pointers pointing to the beginning of the string
		int i = 0;
		//pointing to the end of the string
		int j = a.length() - 1;
		
		while(i<j) {
			//if there is a mismatch
			if(a.charAt(i) != a.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
/**
**
*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints
A will consist at most  lower case english letters.
Sample Input

madam

Sample Output

Yes
*/