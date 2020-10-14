package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Scanner keyboard =new Scanner(System.in);
	        
		    // for(int i = 1; keyboard.hasNext() == true; i++){
		    //     String str = keyboard.nextLine();
		    //     System.out.println(i + " " + str);
		    // }


		    // String str;
		    // int i = 0;
		    // try{
		    //     while(keyboard.hasNext()){
		    //         str = keyboard.nextLine();
		    //         i++;
		    //         System.out.println(i + " " + str);
		    //     }

		    // }finally{
		    //   keyboard.close();
		    // }
		        
//	        int i = 0;
//	        while(keyboard.hasNext()){
//	            i++;
//	            System.out.println(i + " " + keyboard.nextLine());
//	        }
//	        
//	        keyboard.close();
		 
		  
		   // create a BufferedReader using System.in   
		 // read line from console, and exit until "stop"
		   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));   
		    String str;   
		   
		  System.out.println("Enter lines of text.");   
		  System.out.println("Enter 'stop' to quit.");   
		    do {   
		   
		     str = obj.readLine();   
		     System.err.println(str);   
		   }   while(!str.equals("stop"));   
		   

	}

}
/**
 * The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
 */
