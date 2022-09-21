
public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[] [] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Kocaeli";
		sehirler[0][2] = "İzmir";
		sehirler[1][0] = "Konya";
		sehirler[1][1] = "Antalya";
		sehirler[1][2] = "Bolu";
		sehirler[2][0] = "Van";
		sehirler[2][1] = "Kars";
		sehirler[2][2] = "Erzurum";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("------------------------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
