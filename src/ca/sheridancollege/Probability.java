package ca.sheridancollege;

import java.util.Random;
import java.util.Scanner;

public class Probability {

	public static void main(String[] args) {

		int sum;
		double count = 0.0;
		double probabilityCount = 0.0;
		double estimateCount = 0.0;
		
		Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Please enter the number of rolls: ");
        int rolls = scan.nextInt();
        
        for (int i = 1; i <= rolls; i++)
        {
        	int dice1 = random.nextInt(20) + 1;
        	int dice2 = random.nextInt(20) + 1;
        	int dice3 = random.nextInt(20) + 1;
        	sum = dice1 + dice2 + dice3;
        	if (sum >=57)
			{
        		estimateCount++;
			}
        }
        System.out.println("Estimate Probability");
        System.out.println("Total : " + rolls);
        System.out.println("Sum >= 57 Count : " + estimateCount);
        System.out.println("Probability : " + estimateCount/rolls);
        System.out.println("");
        
        for (int dice1 = 1; dice1 <= 20; dice1++)
        {
        	sum = 0;
        	for (int dice2 = 1; dice2 <= 20; dice2++)
        	{
        		for (int dice3 = 1; dice3 <= 20; dice3++)
        		{
        			sum = dice1 + dice2 + dice3;
        			count++;
        			if (sum >=57)
        			{
        				probabilityCount++;
        			}
        		}
        		
        	}
        }
        System.out.println("Empirical Probability");
        System.out.println("Total : " + count);
        System.out.println("Sum >= 57 Count : " + probabilityCount);
        System.out.println("Probability : " + probabilityCount/count);
        
	}
}
