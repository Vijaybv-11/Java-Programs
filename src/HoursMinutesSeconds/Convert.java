package HoursMinutesSeconds;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {

		int totalseconds ;
		int seconds , minutes , hours ;
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the totalseconds :");
		totalseconds = sc . nextInt() ;
		seconds = totalseconds;
		hours = seconds/3600 ;
		seconds = seconds%3600 ;
		minutes = seconds/60 ;
		seconds = seconds%60 ;
		System.out.println("Total seconds : " + totalseconds);
		System.out.println("Hours : " + hours);
		System.out.println("Minutes : " + minutes);
		System.out.println("Seconds : " + seconds);
	}
}
