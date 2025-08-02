package labDay1_myproject;

import java.util.*;

public class string_builder_example {

	public static void main(String[] args) {
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("This is KLH University");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.append(" Hello");
		System.out.println(sb);
		System.out.println(sb.insert(3, "hello "));
		System.out.println(sb1.reverse());
		System.out.println(sb.replace(1, 6, "java"));
		System.out.println(sb.delete(5, 10));
		System.out.println(sb.capacity());
		System.out.println(sb2.capacity());
		sb1.setCharAt(2, 'a'); // returns void type
		System.out.println(sb1);
		System.out.println(sb1.substring(5));
		System.out.println(sb1.subSequence(5, 8));
		System.out.println(sb1.deleteCharAt(5)); //delete character at a particular position
		String str1=sb.toString();
		System.out.print
		
		
	}

}
