package listQuestionsAnswer;

import java.util.Scanner;

public class C03_List {

	public static void main(String[] args) {
		/*	Get a sentence from the user. Accept the sentence received from the user as a parameter, 
	  	Invert sentence using Array and write a Method that returns the result as a String to the main method.
		Note: Upper and lower case letters, spaces and special characters will not be changed.
		
		Input :
		It is very nice to write code.
		
		Output :
		.edoc etirw ot ecin yrev si tI				*/
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Cumle giriniz:");
	

	System.out.println(tersCumle(scan.nextLine()));


	
	scan.close();
}


public static String tersCumle(String str) {
	
	
	
	String arr [] = str.split("");
	
	String ters ="";
	
	
	for (int i = arr.length-1; i >=0 ; i--) {
		
		ters+=arr[i];
	}
	return ters;
	}

}
