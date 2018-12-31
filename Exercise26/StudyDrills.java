/*This is how I attempted to solve the
  Study drills provided from the book.
  The attempt/answer is marked on the lines
  of code.*/
 
  
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudyDrills {
	public static void main(String[] args){
		long start = 0, stop = 0, elapsed, slowest = 0, fastest = Long.MAX_VALUE;
		
		int iterations = 40;
		int SIZE = 20000;
		int[]	intArr = new int	[SIZE];
		Integer[] objArr = new Integer[SIZE];
		
		Random gen = new Random(555555585);
		Scanner kb = new Scanner(System.in);
		
		/*Tests abs value method*/
		System.out.println("Enter a (-) number for its abs val: ");
		int num = kb.nextInt();
		System.out.println(Math.abs(num));
		
		/*changed where it goes into one continious loop*/
		int choice;
		do{
			System.out.println( "1) Primitive ints using selection sort" );
			System.out.println( "2) Integer objects using selection sort");
			System.out.println( "3) Integer objects using Arrays.sort()" );
			System.out.println( "4) Primitive using Arrays.sort()"       );
			System.out.println( "5) To terminate"                        );//
			System.out.print( "Which one? "                              );//
			choice = kb.nextInt();
			if(choice < 0 || choice > 5 || choice == 5){
				break; /*for logic*/
			}
			
			String testDescription = "error";
			
			for ( int runs=0; runs<iterations; runs++ ) {
			
				for ( int i=0; i<SIZE; i++ ) {
					intArr[i] = gen.nextInt(1000);
					objArr[i] = new Integer(intArr[i]);
				}
				
				if ( choice == 1 ) {
					testDescription = "primitive ints using selection sort";
					start = System.nanoTime();
					selectionSortPrimitives(intArr);
					stop = System.nanoTime();
				}
				else if ( choice == 2 ) {
					testDescription = "Integer objects using selection sort";
					start = System.nanoTime();
					selectionSortObjects(objArr);
					stop = System.nanoTime();
				}
				else if (choice == 3 ) { // choice == 3, probably
					testDescription = "Integer objects using Arrays.sort()";
					start = System.nanoTime();
					Arrays.sort(objArr);
					stop = System.nanoTime();
				}
				else if ( choice == 4 ) { /* added */
					testDescription = "Primitive ints using Arrays.sort()";
					start = System.nanoTime();
					Arrays.sort(intArr);
					stop = System.nanoTime();
				}

				elapsed = (stop-start)/1000000;
				
				if ( runs > 10 && elapsed < fastest )
					fastest = elapsed;
				if ( runs > 10 && elapsed > slowest )
					slowest = elapsed;
					
				System.out.print( "\n" + iterations + " runs sorting " + SIZE + " " );
				System.out.println( testDescription );
				System.out.println( "\tFastest time: " + fastest + " milliseconds." );
				System.out.println( "\tSlowest time: " + slowest + " milliseconds." );
			}
		}while(choice < 5 && choice > 0); /*added while loop*/
		
	}
			
	public static void selectionSortPrimitives( int[] arr ) {
		for ( int i=0; i<arr.length-1; i++ ) {
			int min = i;
			for ( int j=i+1; j<arr.length; j++ ) {
			if ( arr[j] < arr[min] )
				min = j;
			}
			if ( min != i ) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	
	public static void selectionSortObjects( Integer[] arr ) {
		for ( int i=0; i<arr.length-1; i++ ) {
			int min = i;
			for ( int j=i+1; j<arr.length; j++ ) {
			if ( arr[j].compareTo(arr[min]) < 0 )
				min = j;
			}
			if ( min != i ) {
				Integer temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
}
			
