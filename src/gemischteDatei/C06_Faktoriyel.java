package gemischteDatei;

public class C06_Faktoriyel {

	public static void main(String[] args) {
		/*
		 * Girdi olarak bir tamsay� kabul eden ve fakt�riyel hesaplayan programi
		 * yaz�niz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=65432*1=720
		 */

		
		int sayi = 12;
		 
		int faktoriyel =1;
		
		for (int i = 1; i <=6; i++) {
			
			faktoriyel*=i;
		}
		
		System.out.println(sayi+"!="+faktoriyel);

	}

}
