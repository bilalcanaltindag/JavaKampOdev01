
public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 21;
		int counter = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				counter++;
			}
		}
		
		if (counter < 2) {
			System.out.println("Girilen Sayı Asaldır");
		}
		else {
			System.out.println("Girilen Sayı Asal Değildir");
		}

		
	}

}
