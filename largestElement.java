package selfExercise;

import java.util.Scanner;

public class largestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[] sales = new double[5];
		//double sales[] = {10.00, 20.00, 50.00, 40.00, 30.00};
		int index, maxIndex;
		double largestSale;
		
		maxIndex = 0;
		System.out.print("Enter 5 array elements : ");
		for(int i = 0; i < sales.length;i++)
			sales[i] = sc.nextDouble();
			
		for(index = 1; index<sales.length; index++)
			if(sales[maxIndex] < sales[index])
			maxIndex = index;
		System.out.println(maxIndex);
		largestSale = sales[maxIndex];
		
		System.out.println(largestSale);

		
	}

}
