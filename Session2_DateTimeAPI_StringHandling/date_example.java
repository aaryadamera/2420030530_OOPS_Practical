package labDay1_myproject;
import java.util.*;
public class date_example {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("Current date is: " + d);
		int month =d.getMonth();
		System.out.println("Current month is: " + month); // starts from 0 
		int year = d.getYear();
		System.out.println(year);
	    System.out.println(d.getMonth());
		System.out.println(d.getHours());
	}

}

