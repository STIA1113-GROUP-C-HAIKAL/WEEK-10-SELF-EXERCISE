package selfExercise;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[]row []collumn
		
		int[][] integers = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		//Row
		for(int i = 0; i < 3; i++) {
			int sum =0;
			for (int j = 0; j < 4; j++)
				sum += integers [i][j];
			
			System.out.println("The sum of row " + (i + 1) + ": " + sum);
			
		}
	}

}
