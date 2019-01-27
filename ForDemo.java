class ForDemo {
	public static void main(String[] args) {
		
		int hours, minutes, seconds;
		
		/* for (int i=1; i<11; i++) {
			System.out.println("Count is : " + i); 
		} */
		
	for (hours = 0; hours < 24; hours++) {
		for (minutes = 0; minutes < 60; minutes++) {
			for(seconds = 0; seconds < 60; seconds++) {
				System.out.print(hours);
				System.out.print(":");
				System.out.print(minutes);
				System.out.print(":");
				System.out.println(seconds);
			}
		}
	}
	}
}