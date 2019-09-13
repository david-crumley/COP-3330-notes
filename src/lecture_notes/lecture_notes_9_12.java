package lecture_notes;

import java.util.Scanner;

public class lecture_notes_9_12 {

	public static void main(String[] args) {
		/* plan ahead before writing code.
		 * 1) write psuedo code first
		 */ 
		
		/* EX:
		 * 
		 * prompt user for input
		 * get numbers from user
		 * store numbers from user in x and y
		 * 
		 * print x + y
		 *	 
		 * print x * y
		 *
         */
	
		/*
		 * 2) Just do what the program needs and nothing more
		 */
	
		int x, y;
		// could also do vvv and not import scanner in the beginning
		// java.util.Scanner in = new java.util.Scanner(System.in);
		Scanner in = new Scanner(System.in);
		/* Scanner type is an object stored on the heap like dynamic alocated memory
		 * there is no free() because of the 'garbage collector' in the language
		 *  
		*/
		
		System.out.println("Enter an intager");
		x = in.nextInt();
		
		System.out.println("Enter second integer");
		y = in.nextInt();
		
		System.out.printf("%d + %d = %d\n",x, y, x + y);
		System.out.printf("%d * %d = %d\n",x, y, x * y);
		
	
	}

}
