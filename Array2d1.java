package selfExercise;

public class Array2d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] username = {
				{"Username", "Haikal321", "Joko545","Santi345"},
				{"Password", "Cikupa21", "Gagak554", "Meruya334"}
		};
		
		for(int i = 0; i < 4; i++) {
			String sum = "";
			for(int j = 0; j < 2; j++)
				sum += username[j] [i];
			
			System.out.println("The Username and Password " + (i + 1) + ": " + sum);
		}
						 

	}

}
