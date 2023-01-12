package Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int MaxN =scan.nextInt();
		int realN = 1;
		int N = 1;
		int dummyN = 1;
		int scale = 1;
		int[] digit = new int[4];
		int i = 0;
		int gap = 0, count = 0;
		
		
		while (realN <= MaxN) {
			N = realN;
			dummyN = N;
			for (dummyN = N; dummyN >= 10; dummyN = dummyN / 10) {
				scale++;
			}
			for(i = scale; i > 0; i--) {
				digit[i-1] = N % 10;
				N = N / 10;
			}
			gap = digit[i] - digit[i + 1];
			if (scale == 1) {
				count++;
			}
			while(i < scale - 1 && scale > 1) {
				
				if(gap != digit[i] - digit[i + 1]) {
					break;
				}
				
				gap = digit[i] - digit[i + 1];
				
				i++;
				if(i == scale - 1) {
					count++;
				}
			}
			realN++;
			scale = 1;
		}
		System.out.println(count);
	}

}