package CountBinarydigitInGivenNumber;

import java.util.Scanner;

public class BinaryDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n ;
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the number : ");
		n = sc . nextInt ( ) ;
		int count=0;
		while(n!=0){
			int rem=n%10;
			if(rem==0 || rem==1)
			{
			count++;
			}
			n=n/10;
			}
			System.out.println(count);
			}

	}


