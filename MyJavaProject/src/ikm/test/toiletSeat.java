package ikm.test;

import java.util.Scanner;

public class toiletSeat {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String seats = scan.nextLine();
		scan.close();
		
		int dCount = 0, uCount=0, count=0;

		for(int i = 1; i < seats.length(); i++) {
			if(i == 1) {
				if(seats.charAt(0) == 'U' && seats.charAt(1) == 'D') dCount += 2;
				if(seats.charAt(0) == 'D' && seats.charAt(1) == 'U') dCount++;
				if(seats.charAt(0) == 'D' && seats.charAt(1) == 'D') dCount++;
			}
			else if(seats.charAt(i) == 'D') dCount += 2;
		}

		
		for(int i = 1; i < seats.length(); i++) {
			if(i == 1) {
				if(seats.charAt(0) == 'U' && seats.charAt(1) == 'U') uCount++;
				if(seats.charAt(0) == 'U' && seats.charAt(1) == 'D') uCount++;
				if(seats.charAt(0) == 'D' && seats.charAt(1) == 'U') uCount+=2;
			}
			else if(seats.charAt(i) == 'U') uCount += 2;
		}
		
		for(int i = 1; i < seats.length(); i++)
			if(seats.charAt(i) != seats.charAt(i - 1))
				count++;
		
		System.out.println(dCount);
		System.out.println(uCount);
		System.out.println(count);

	}
}
