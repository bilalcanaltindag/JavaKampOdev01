
public class recapDemo1 {

	public static void main(String[] args) {
		int a = 25;
		int b = 33;
		int c = 42;
		
		int enBuyuk = a;
		
		if (enBuyuk<b) {
			enBuyuk = b;
		}
		
		if (enBuyuk<c) {
			enBuyuk = c;
		}

		System.out.println("En Büyük = " + enBuyuk);
	}

}
