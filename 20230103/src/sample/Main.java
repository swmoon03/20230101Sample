package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 1;
		int n = scan.nextInt();
		if (n % 2 == 1) {
			for (a = n / 2; a > 0; a--) {
				for (b = a; b > 0; b--) {
					System.out.print(" ");
				}
				for (c = 0; c < d; c++) {
					System.out.print("*");
				}
				d = d + 2;
				System.out.println("");
			}
			for (a = 0; a < n; a++) {
				System.out.print("*");
			}
				System.out.println("");
				d = n - 2;
			for (a = 1; a < n / 2 + 1; a++) {
				for (b = a; b > 0; b--) {
					System.out.print(" ");
				}
				for (c = 0; c < d; c++) {
					System.out.print("*");
				}
				d = d - 2;
				System.out.println("");
			}
		}
	}
}
