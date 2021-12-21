package gemischteDatei;

public class C09_TersRakam {

	public static void main(String[] args) {
		/*
		 * Kullan�c�n�n girdi�i say�y� tersine �eviren bir java program� yaz�n�z.
		 * (Mulakat Sorusu)
		 * 
		 * Input :1238
		 * 
		 * Output :Girilen Numananin Tersi: 8321
		 */

		String sayi = "1238";

		String str = "";

		for (int i = sayi.length() - 1; i >= 0; i--) {

			str += sayi.charAt(i);
		}

		System.out.println("Girilen Numananin Tersi: " + str);

	}

}
