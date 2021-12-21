package listQuestionsAnswer;

import java.util.ArrayList;
import java.util.List;

public class C06_List {

	public static void main(String[] args) {
		/*
		 * Write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 * 
		 * Input1 : {John,Brad,Ange,Sofia,Emily}
		 * 
		 * Input2 : {sofia,brad,grace,emily,hazel}
		 * 
		 * Output : [sofia,brad,emily]
		 */

		String arr1[] = { "John", "Brad", "Ange", "Sofia", "Emily" };

		String arr2[] = { "sofia", "brad", "grace", "emily", "hazel" };

		List<String> list = new ArrayList<>();

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr1.length; j++) {

				if (arr2[i].equalsIgnoreCase(arr1[j])) {

					list.add(arr2[i]);

				}

			}

		}

		System.out.println(list);

	}

}
