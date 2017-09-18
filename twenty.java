/*
Authors: Samuel Ehlmann, Samantha Santiago
Name: Gourd 2
Description: Takes input from a .txt file, stores it as integer values on a 20x20
grid, and then adds up 4 numbers going down each row to find the greatest sum.
*/

import java.util.Scanner;

public class twenty
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); //new scanner to read StdIn()
		int max = 0; //maximum value is currently 0
		int[][] grid = new int[20][20]; //new 20x20 grid
		
		for(int i=0; i<20; i++) //this for loop allows the grid to be populated by all 400 values
		{	
			for(int j=0; j<20; j++)
			{	
				grid[i][j] = s.nextInt(); //each integer in the .txt is added to grid
			}
		}	
		
		for(int i=0; i<20; i++)
		{	
			for(int j=0; j<17; j++) //j goes to 17 because of how the numbers get added up below
			{//j position is moved up for each progressing number				
				int temp = 0; //temporary value to store until it's greater than max
				temp = grid[i][j] + grid[i][j+1] + grid[i][j+2] + grid[i][j+3];
				if (temp > max)
				{
					max = temp; //temp becomes the new max
				}
			}	
		}	
		System.out.println(max); //outputs the max value to the terminal
	}
}





