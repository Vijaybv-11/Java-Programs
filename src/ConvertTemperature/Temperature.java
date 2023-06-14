package ConvertTemperature;

import java.util.Scanner;

public class Temperature {
		
		public static void main(String[] args)
		{
		double Fahren ;
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the Fahrenheit :");
		Fahren = sc . nextDouble();
		double Celsius ;
		Celsius =((5.0 / 9.0) * Fahren - 32.0);
		System.out.println("Celsius : " +Celsius);
	}

}
