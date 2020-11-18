import java.util.ArrayList;
import java.util.Scanner;

/*
 * Reversing the order of characters in each word within a sentence while preserving whitespace and initial word order. 
 */
public class Imp_ReverseString {

	private static ArrayList<String> sbList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Reverse Words in a String");
		System.out.println("Enter String:");
		
		String s = scan.nextLine(); // gets text entered by the user to reverse
		
		System.out.println("input: " + s);
		
		System.out.print(ReverseString(s));

	}
	
	private static String ReverseString(String str)
	{
		sbList = new ArrayList<>(); // stores each word
		String output = "output: "; //stores the reversed output
		
		int j =0;
		for(int i =1; i <= str.length(); i++)
		{
			//gets the words that contains a space or is the last word in the sentence 
			if(str.substring(j, i).contains(" ") || i == str.length())
			{	
				//get values with index starting from j and ending at i
				// add each word to the list and remove the white spaces
				sbList.add(str.substring(j, i).trim()); 
				
				j=i; //once white space has been found, search for next word by positioning the beginning of next word after the space. Repeat until index of i is positioned at the end of the sentence.
			}
			
		}
		
		
		//go through each word gathered from the sentence
		for(int k =0; k < sbList.size(); k++)
		{
			//create a temporary stringbuilder
			StringBuilder tempSB = new StringBuilder();
			
			//this will store each word into object
			tempSB.append(sbList.get(k));
			
			//which will reverse the characters and append to string variable
			output += tempSB.reverse().toString() + " ";
			
		}
		
		//display output
		return output;
	}

}
