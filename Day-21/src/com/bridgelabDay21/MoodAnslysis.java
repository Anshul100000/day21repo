package com.bridgelabDay21;

import java.util.Scanner;

public class MoodAnslysis {
	
	public static int checkingMood (int number)
	{
	int rem = 0, sum = 0;
	// calculate the sum of squares of each digits
	while(number > 0)
	{
	rem = number %10;
	sum = sum+(rem*rem);
	number = number/10;
	}
	return sum;
	}
	public static void main(String[] args)
	{
	// Take number from KeyBoard
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a non-zero Positive Number:");
	int number = sc.nextInt( );
	int result = number;
	while (result != 1 && result != 4)
	{
	result = checkingMood(result);
	}
	if (result ==1)
	{
	System.out.println ("i am happy");
	}
	else
	{
	System.out.println ("i am sad");
	}
	}

}
