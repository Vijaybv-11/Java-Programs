package SquareandCubeofNumber;

import java.util.Scanner;

public class PerfectSquare {
	static boolean checkPerfectSquare(double x)
	{
	double sq = Math.sqrt(x);
	return ((sq-Math.floor(sq))==0);
	}
	public static void main(String[] args)
	{
	double num ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	num = sc.nextDouble();
	if(checkPerfectSquare(num))
	System.out.println(num+" is a perfect square number");
	else
	System.out.println(num+" is not a perfect square number");

}
}