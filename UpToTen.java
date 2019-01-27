class UpToTen {
	public static void main(String[] args) {
		int base = 1;
		int square;
		
		do {
			System.out.println("The current number is: " + base);
			base++;
			square = base * base;
			System.out.println("The square of the number is: " + square);
		} while (base <11);
	}
}