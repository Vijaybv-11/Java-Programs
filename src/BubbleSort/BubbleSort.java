package BubbleSort;

import java.util.Scanner;

public class BubbleSort {
	

	public static void main(String[] args)
	{
	
	int [ ] arr = { 8 , 7 , 5 , 9 , 2 , 10 };
	int n=arr.length-1;
	for( int i=1;i<n; i++)
	{
	for( int j=1;j<n; j++)
	{
	if ( arr[ j - 1 ] > arr[ j ] )
	{
	int temp = arr [ j-1 ] ;
	arr [ j-1 ] = arr [ j ] ;
	arr [ j ] = temp ;
	}
	}
	}
	for( int i=0 ; i<arr.length; i++)
	{
	System.out.println( arr[ i ]+ " ");

	}
}
}
