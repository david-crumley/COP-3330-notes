package lecture_notes;

import java.util.Scanner;

public class lecture_notes_9_12_a {
	/* if - else statements
	 * always use brackets
	 */
	
	/* psudo code
	 * 
	 * take in 2 integers from user; x and y
	 * if x is greater then y, print 'x is larger'
	 * else if y is greater; print 'y is larger'
	 * else print ' they are equal'
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x, y;
		
		x = in.nextInt();
		y = in.nextInt();
		
		if (x > y)	{
			System.out.printf("x is larger\n");
		}
		else if (y > x)	{
			System.out.printf("y is larger\n");
		}
		else	{
			System.out.printf("they are equal\n");
		}
	
	}

}
