package gemischteDatei;

import java.util.Scanner;

public class C05_EbobEkok {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan 2 tamsay� girmesini ve ard�ndan GCD (En B�y�k Ortak B�len) ve
		 * LCM'yi (En K���k Ortak Kat) bulmas�n� isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti: Beklenen Cikti: 30 ve 40 icin GCD = 10
		 * 
		 * 30 ve 40 icin LCM = 120
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("2 tam sayi giriniz:");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int Ebob = 0;

		for (int i = sayi1; i >= 1; i--) {

			if (sayi1 % i == 0 && sayi2 % i == 0) {
				System.out.println(sayi1 + " ve " + sayi2 + " icin GCD = " + i);
				Ebob = i;
				break;
			}
		}

		System.out.println(sayi1 + " ve " + sayi2 + " icin LCM = " + sayi1 * sayi2 / Ebob);

		scan.close();

	}

}
