package Practice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int dummy = start;
		int digit1 = 0;
		int digit2 = 0;
		int cycle = 0;
		
		do {
			
			cycle++;
			
			digit2 = (dummy < 10) ? 0 : dummy / 10;
			digit1 = dummy % 10;
			
			dummy = ((digit1 + digit2) % 10) + (digit1 * 10);
			
		} while (dummy != start);
		
		System.out.println(cycle);
	}
	
}