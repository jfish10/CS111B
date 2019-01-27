import java.util.Scanner;

class SwitchTest {
	public static void main(String[] args) {
	int month;
	String monthString = "";
	
	
	System.out.println("Enter the name of a month: ");
	Scanner scanner = new Scanner (System.in);
	monthString = scanner.nextLine();
	 
	
	switch(monthString.toLowerCase()) {
		case "january": month = 1;
			break;
	
		case "february": month = 2;
			break;
		
		case "march": month = 3 ;
			break;
		
		case "april": month = 4;
			break;
		
		case "may": month = 5;
			break;
		
		case "june": month = 6;
			break;
		
		case "july": month = 7;
			break;
		
		case "august": month = 8;
			break;
		
		case "september": month = 9 ;
			break;
		
		case "october": month = 10;
			break;
		
		case "november": month = 11;
			break;
		
		case "december": month = 12;
			break;
		
		default: month= 0;
			break;
	}
	System.out.println(month);
	
}
}

	