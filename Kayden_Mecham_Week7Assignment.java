import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Kayden_Mecham_Week7Assignment 
{

	public static void main(String[] args) 
	{
		style();
		 System.out.println("Football Team Randomizer Season Scores");
		style();
		 Scanner w7 = new Scanner(System.in);
		 Random score = new Random();
		  int teams = 0;
		  int games = 0;
		  int min = 10;
		  int max = 74;
		  int tot = 0;
		  int avg = 0;
		  int best = 0;
		  
		  System.out.print("Enter the number of teams: ");
		   teams = w7.nextInt();
		  System.out.print("Enter the number of games: ");
		   games = w7.nextInt();
		style();
		 
		int [][] fb = new int [teams][games];
		  
		for (int a = 0; a < teams; a++)
		  {
			  for (int b = 0; b < games; b++)
			  	{
				  fb[a][b] = score.nextInt((max - min) + 1) + min;
			  	}
		  }

		style();
		System.out.println("Football Scores Report");
		style();
		System.out.println("Team\tScores \t\t\t       Tot\nAvg");
		style();
		  for (int a = 0; a < teams; a++)
		  {
			System.out.print((a + 1) + ":\t");
			  for (int b = 0; b < games; b++)
			  {
				System.out.print(fb[a][b] + " ");
				tot = tot + fb[a][b];
				avg = tot + fb[a][b] / games;			  
			  }
			 System.out.print("\t" + tot +"\n" + avg);
			 System.out.println();
		  } 
		  style();
	}

		private static void style() 
			{
			System.out.println("--------------------------------------------");
			System.out.println("--------------------");
			}


	

}
