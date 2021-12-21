package gemischteDatei;

public class C10_TekrarlananKarakter {

	public static void main(String[] args) {
		/*
		 * Bir String icerisinde yinelenen karakterleri d�nd�ren bir kod
		 * yaz�niz.(m�lakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=�Javaisalsoeasy�
		 * 
		 * Output: a s
		 */

		String str1 = "Javaissoeasy";
		String depo = "";

		for (int i = 0; i < str1.length(); i++) {

			for (int j = i + 1; j < str1.length(); j++) {

				if (str1.charAt(i) == str1.charAt(j) && !depo.contains(str1.substring(i, i + 1))) {
					depo += str1.charAt(i) + " ";
				}
			}
		}

		System.out.println(depo);

	}

}
