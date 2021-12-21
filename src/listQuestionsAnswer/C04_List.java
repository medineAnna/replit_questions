package listQuestionsAnswer;

import java.util.ArrayList;
import java.util.List;

public class C04_List {

	public static void main(String[] args) {
		/*Write a program that deletes the letters 'a' from the names in the list given as input.

	     INPUT : 
	     list1={"Ali","Veli","Ayse","Fatma","Omer"}

	     OUTPUT : 
	     
	     [Veli,Omer]*/
			
			
			String arr [] = {"Ali","Hasan","Ayse","Fatma","Omer"}; 
			
			List<String> list = new ArrayList<>();
			
			
			for (String string : arr) {
				
				list.add(string);
			}
			
			
			for (int i = 0; i < list.size(); i++) {
				
				if (list.get(i).contains("a")) {
					
					list.remove(i);
					i--;
					
				}
				
			}
			
			
			System.out.println(list);

	}

}
