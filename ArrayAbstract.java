package selfExercise;

import java.util.Scanner;

public class ArrayAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sales;
		int arraySize;
		
		System.out.println("Enter the number of length you want to store in : ");
		arraySize = sc.nextInt();
		
		System.out.println("Enter the number of elements you want to store: ");
		sales = sc.nextInt();
		
		int[] array = new int[arraySize];
		
		System.out.println("Enter the elements of arrays you want to store: ");
		for(int i = 0; i<sales; i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("The Array elements are : ");
		
		for (int i=0; i<sales; i++)
		{
			System.out.println(array[i]);
			
			sc.close();
		}
	}

}
