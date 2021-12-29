package classExercise;

import java.util.Scanner;

public class classExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int list1[] = new int [5];
		int list2 [] = new int [5];
		
		System.out.print("Please enter the array elements : ");
		for(int i=0; i < list1.length;i++)
			list1[i] = sc.nextInt();
		
		System.out.println();
		
		for(int i=0; i < list1.length; i++)
			list2[i] = list1[i];
		
		for(int i=0; i < list2.length; i++)
			System.out.println(list2[i]);

	}

}
