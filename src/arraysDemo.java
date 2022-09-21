
public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Bilal";
		String ogrenci3 = "Gülbeyaz";
		String ogrenci4 = "Başak";
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		String[] ogrenciler = new String[5];
		ogrenciler[0] = "Engin";
		ogrenciler[3] = "Gülbeyaz";
		ogrenciler[4] = "Başak";
		ogrenciler[1] = "Bilal";
		ogrenciler[2] = "Efe";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci : ogrenciler) {
			System.out.println("Foreach öğrenci :" + ogrenci);
		}
	}

}
