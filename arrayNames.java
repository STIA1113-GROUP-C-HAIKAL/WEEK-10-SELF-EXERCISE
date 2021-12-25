package selfExercise;

public class arrayNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nameList = new String[5];
			nameList[0] = "Amanda Green";
			nameList[1] = "Vijay Arora";
			nameList[2] = "Sheila Mann";
			nameList[3] = "Rohit Sharma";
			nameList[4] = "Mandy Johnson";
		
			//Length = buat ngeliat berapa panjang list namanya
		System.out.println(nameList.length);
			
			//For loop, buat nge print semua nama, I adalah 0 jika I masih lebih kecil dari 
			//Panjang name list maka bakal terus ngeloop
		for (int i = 0; i < nameList.length; i++) {
			System.out.println(nameList[i]);
		}
	}

}