package listQuestionsAnswer;

import java.util.Arrays;
import java.util.Scanner;

public class C05_List {

	public static void main(String[] args) {
		/*
		 * Write a program that accepts an integer as input and prints first 10 prime
		 * numbers greater than input Check numbers if they are even or not in a return
		 * method.
		 * 
		 * Input : 5
		 * 
		 * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Baslangic sayisi giriniz:");

		ArrayAsal(scan.nextInt());
scan.close();
	}

	public static String[] ArrayAsal(int sayi) {
		int sayac = 0;

		boolean kontrol = true;
		String bos = "";

		for (int i = sayi + 1; i < Integer.MAX_VALUE; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					kontrol = false;
					break;
				}

			}

			if (kontrol) {
				bos += i + " ";
				sayac++;
			}
			kontrol = true;
			if (sayac == 10) {
				break;
			}

		}

		String arr1[] = bos.split(" ");
		System.out.println(Arrays.toString(arr1));
		return arr1;
	}

}
