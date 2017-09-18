/**************************************************
* Authors: Samuel Ehlmann, Samantha Santiago
* Name: Project Gourd 1
* Description: reads numbers from stdin and returns chart of leading digit counts and percentages
**************************************************/

import java.util.Scanner;

class Input
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); //new scanner to read input from StdIn

		int[] counts = new int[10]; //0-9 for the count
		int total = 0; //currently our total

		while (s.hasNext())
		{
			int num = s.nextInt(); //reads the number on the list
			while (num >= 10) //this function gets the number down to the first digit through division by 10
				num /= 10; //divides and stores

			counts[num]++; //increments
			total ++;
		}

		//the following is the construction/formatting for the chart

		System.out.println("--------------------------------"); 
		System.out.println("Leading Digit  Count           %");
		System.out.println("--------------------------------");

		for (int i = 0; i<10; i++) //prints rows for each starting digit, its count, and the percent
		{
			String start = String.format("%d              %d", i, counts[i]); //beginning of string for the line
			float percentage = (float) counts[i] / total * 100; //calculate the percentage
			String end = String.format("%.2f%%", percentage); //end of string for line (percentage formatted)
			
			int length = start.length() + end.length();
			for (int j = 0; j + length < 32; j++) //add as many spaces between start and end strings as necessary
				start += " ";
			System.out.println(start + end);
		}

		System.out.println("--------------------------------"); //end of chart starts here

		String start = String.format("TOTAL          %d", total); //same thing as with digit count rows but simplified, start string
		String end = "100.00%%"; //end string
		int length = start.length() + end.length();
		for (int j = 0; j + length < 32; j++) //add as many spaces as necessary
			start += " ";
		System.out.println(start + end);

		System.out.println("================================");
	}
}