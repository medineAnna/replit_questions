package gemischteDatei;

public class C04_DogalSayi {

	public static void main(String[] args) {
		/*
		 * 1'den 100'e kadar olan do�al say�lar�n toplam�n� bulan program� yaz�n�z.
		 * 
		 * OutPut:
		 * 
		 * Sayilarin Toplami : 5050
	
		 */
		int toplam=0;
		
		for (int i = 1; i <= 100; i++) {
			toplam+=i;
		}
		
		System.out.println("Sayilarin Toplami :"+toplam);
	}

}
