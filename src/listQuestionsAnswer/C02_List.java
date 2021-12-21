package listQuestionsAnswer;

import java.util.ArrayList;
import java.util.List;

public class C02_List {

	public static void main(String[] args) {
		/*
		 * Create a 10-element list. Swap the 8th element with the 3rd element.
		 * 
		 * INPUT : String[]
		 * names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan",
		 * "Ahmet","Ali"};
		 * 
		 * Output:
		 * 
		 * [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		 */

		String arr1[] = { "Umit", "Emin", "Furkan", "Kerem", "Taylan", "Orhan", "Sinan", "Kemal", "Ahmet", "Ali" };

		List<String> list = new ArrayList<>();

		for (String each : arr1) {

			list.add(each);
		}

		System.out.println(list);

		String str1 = "";
		String str2 = "";

		str1 += list.get(3);
		str2 += list.get(8);

		list.set(3, str2);
		list.set(8, str1);

		System.out.println(list);
	}

}
