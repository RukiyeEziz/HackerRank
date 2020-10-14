package introduction;

import java.util.Scanner;

public class SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
        //String smallest = "";
        //String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //for(int i = 0; i < s.length(); i++){
            //System.out.println(s.substring(i, k));
        //}
        //Scanner scan=new Scanner(System.in);
        //String str=scan.next();
        //int k=scan.nextInt();
        //SortedSet<String> sets=new TreeSet<String>();
        //for(int i=0;i<=s.length()-k;i++){
            //sets.add(s.substring(i,i+k));
        //}
        //System.out.println(sets.first());
        //System.out.println(sets.last());

        String smallest = s.substring(0,k);
        String largest  = "";
        for(int i = 0; i < s.length() - k + 1; i++){
            if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k); 
        }
        
        return smallest + "\n" + largest;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println("Enter an integer:");
        int k = scan.nextInt();
        System.out.println("Given a string, , and an integer, , it completes the function "
        		+ "so that it finds the lexicographically smallest and largest substrings of length .");
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}

}
/**
*
*Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Output Format

Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
*/