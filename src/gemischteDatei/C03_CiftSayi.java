package gemischteDatei;

public class C03_CiftSayi {

	public static void main(String[] args) {
		/*
		 * 100'den 0'a kadar �ift say�lar� yazd�r�n, ancak decrement(i--) kullanmay�n.
		 * 
		 * OUTPUT : 100 98 96 94 92 � � � � 2 0
		 */

		for (int i = 100; i >= 0; i -= 2) {

			System.out.print(i + " ");

		}

	}

}
