
public class loopDemo {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		
		int i = 1;
		
		/* while (i > 10) {
			System.out.println(i);
			i++;
		} */
		
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While Döngüsü Bitti");
		
		int j = 20;
		
		do {
			System.out.println("Log");
			System.out.println("do"+j);
			j+=2;
		
		}while(j<10);
		
		
	}

}
