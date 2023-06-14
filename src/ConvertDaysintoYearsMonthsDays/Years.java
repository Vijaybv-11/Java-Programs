package ConvertDaysintoYearsMonthsDays;

import java.util.Scanner;

public class Years {
	public static void main(String[] args)
	{
	int totaldays ;
	int days , months , years;
	Scanner sc = new Scanner(System .in ) ;
	System.out.println("Enter the totaldays : ");
	totaldays = sc . nextInt();
	years = totaldays/365;
	totaldays = totaldays%365;
	months = totaldays/30;
	days = totaldays%30;
	System.out.println("Years : " + years);
	System.out.println("Months : " + months);
	System.out.println("Days : " + days);
	}
	

}
