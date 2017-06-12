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
			
	
