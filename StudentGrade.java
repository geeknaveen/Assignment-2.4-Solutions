/* A student has A grade if marks are more than 70, B grade if marks are between 61 and 70 
    and C grade if marks are less than 61 ) Write a program to print the grade for the given marks.  
    Take three subjects like PCM and calculate the average and the above grading system will 
    work on the average.  Take marks of the subject from the user */ 

package asst2_4;

import java.util.Scanner;

public class StudentGrade {
	private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
        int Physics, Chemistry, Maths;
        float sum;
        float average;
        
        System.out.print("Enter your Physics marks: ");
        Physics = input.nextInt();

        System.out.print("Enter your Chemistry marks: ");
        Chemistry = input.nextInt();

        System.out.print("Enter your Maths marks: ");
        Maths = input.nextInt();

        sum = Physics + Chemistry + Maths;
        average = (float) sum / 3;
       
        System.out.println("Your average PCM marks is: " + average);
        
        if(average>70) 
		{
		System.out.println("The Student has secured A grade ");
		}
		else if(average>=61 && average<=70) 
		{
		System.out.println("The Student has secured B grade ");
		}
		else
		{
		System.out.println("The Student has secured C grade ");
		}
}	}
			
	
