 /* Write a program TestDemo.java, which accepts the number as argument and print “You 
    Have Entered Zero” if the value is equal to 0 along with the ASCII value of the number.  
      It should print “You Have Entered Positive Value” if the value is greater than 0 along with 
    the ASCII value.  
        It should print “You Have Entered Negative Value” if the value is less than 0 along with the 
    ASCII value */

package asst2_4;

import java.util.Scanner;

public class TestDemo {
	
	private static Scanner sc;
	
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		   System.out.println(" Please Enter the value ");
		int  n1= sc.nextInt();
		if(n1 == 0)
		  System.out.println("You have Entered ZERO ");
		else if (n1 < 0)
		   System.out.println("You have Entered Negative value ");
		else 
			System.out.println("You have Entered positive value ");
	
		sc = new Scanner(System.in);
		System.out.println("Please Enter the value again: ");
		String n11 = sc.nextLine();
		char[] ascii1 = n11.toCharArray();

		for(char ch:ascii1){
		    System.out.println("The ASCII value is: "+ (int)ch);
		    sc.close();
		}}}



