package gemischteDatei;

public class C07_ForWhile {

	public static void main(String[] args) {
		/*
		 * Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
		 * 
		 * Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi
		 * bir say� M�kemmel Say� olarak bilinir. Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir. 1 2 3 =6 ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */

		int sayi = 6;
		int bolenToplam = 0;

		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {
				bolenToplam += i;
			}

		}

		if (bolenToplam == sayi) {
			System.out.println("Mukemmel sayidir");
		} else {
			System.out.println("Mukemmel sayi degildir.");
		}


	}

}
