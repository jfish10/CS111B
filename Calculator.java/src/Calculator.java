import java.util.Scanner;

public class Calculator {
	
	//states and characteristics of the Calculator class
	int x;
	int y;
	int result;
	
	//addition method
	public void add() {
		result = x + y;
	}
	
	//subtraction method
	public void subtract() {
		result = x - y;
	}
	
	//multiplication method
	public void multiply() {
		result = x * y;
	}
	
	//division method
	public void divide() {
		result = x/y;
	}
	//main method
	public static void main(String[] args) {
		Calculator mySimpleCalculator = new Calculator(); //instantiate the Calculator object
		
		
		
		System.out.println("Enter the first number: ");
		Scanner scan = new Scanner(System.in);
		mySimpleCalculator.x = scan.nextInt();
		System.out.println("Enter the second number: ");
		Scanner scan2 = new Scanner(System.in);
		mySimpleCalculator.y = scan2.nextInt();
	   
		System.out.println("Enter '1' for addition, '2' for subtraction, '3' for multiplication, '4' for division");
		Scanner scan3 = new Scanner(System.in);
		int choice = scan3.nextInt();
		
		if(choice == 1) {
		mySimpleCalculator.add();
	    System.out.println("The sum of both numbers is: " + mySimpleCalculator.result);
		}
	    
	    else if(choice == 2) {
	    mySimpleCalculator.subtract();
	    System.out.println("The difference is: " + mySimpleCalculator.result);
	    }
		
	    else if(choice==3) {
	    	mySimpleCalculator.multiply();
	    	System.out.println("The product is: " + mySimpleCalculator.result);
	    }
		
	    else if(choice==4) {
	    	mySimpleCalculator.divide();
	    	System.out.println("The divisor is: " + mySimpleCalculator.result);
	    }
				
	}
	
}