package labDay1_myproject;
public class string_example {

	public static void main(String[] args) {
		String str = "hello this is java class";
		String str1 = "hello";
		String str2 = "HeLLO";
		String str3 = "hi, how are you";
		String str4 = "hello";
		String str5 = "1234";
		String str6 = "java234";
		String str7  = " ";
		String str8 = "    hello java";
		System.out.println(str.length()); // find the length of the string
		System.out.println(str.toUpperCase()); // converting into UPPERCASE
		System.out.println(str.toLowerCase()); // converting into LOWERCASE
		System.out.println(str.charAt(8));     // to find location of a character
		System.out.println(str1.compareTo(str4)); // to compare two strings in a dictionary manner // return an integer if equal 0 
		System.out.println(str1.compareToIgnoreCase(str2)); // returns integer
		System.out.println(str1.concat("World")); // attaches / combines strings which are either defined or not-defined // returns string
		System.out.println(str1.contains("hel"));   // checks whether the particular string/char is present or not... returns BOOLEAN type output
		System.out.println(str1.contentEquals(str4)); // return boolean value.. checks given string is there or not
		System.out.println(str1.endsWith(str3)); // returns boolean checks whether a particular string end with particular character
		System.out.println(str1.equals(str3));
		System.out.println(str1.indexOf('1')); // returns first occurrence of a character
		System.out.println(str1.matches("[a-zA-Z]+")); // matching regular expressions (a-z), (A-Z) (0-9) // returns boolean value
		System.out.println(String.join("|", str2,str3,str4)); // join two or more strings together using separator (|) // 
		System.out.println(String.join(":","hello","hi","I'm Aarya","Nice to meet you"));
		System.out.println(str1.lastIndexOf('1')); // returns the last index of occurrence
		System.out.println(str1.replace('l','p')); // replaces the new character with older one 
		System.out.println(str1.replaceFirst("hello", "tro"));  // replace first 3 characters with new characters
		String str10 = "hi;how;are;you";
		String str8[]=str10.split(";"); // delimiter as a parameter and separates the words with spaces // returns string array
		for(String i:str8)
		{
			System.out.println(i);
		}
		System.out.println(str6.startsWith("J"));
		System.out.println(str,subSequence(5,13));
	}
}
