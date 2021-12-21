package gemischteDatei;

public class C08_MukkemmelSayi {

	public static void main(String[] args) {
		/*
		 * Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n. Say�n�n
		 * kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi bir say�
		 * M�kemmel Say� olarak bilinir. Input : 6 Output: 6 Mukemmel Sayidir.
		 * ====================== Input 7 Output: 7 Mukemmel Sayidir degildir.
		 */

		int sayi = 7;

		int toplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}

		}

		System.out.println(toplam);

		if (sayi == toplam) {
			System.out.println("Mukemmel sayi");
		} else {
			System.out.println("Mukemmel sayi degil");
		}

	}

}
