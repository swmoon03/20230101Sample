package Practice;

import java.util.Scanner;

public class Main {  //1부터 MaxN 중 "각 자리 수가 등차수열을 이루는 자연수"의 개수를 구하는 코드

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int MaxN =scan.nextInt();  //int의 한계로 MaxN은 21억까지만 가능
		int realN = 1;
		int N = 1;
		int dummyN = 1;
		int scale = 1;
		for (dummyN = MaxN; dummyN >= 10; dummyN = dummyN / 10) scale++;
		int[] digit = new int[scale]; 
		int i = 0;
		int gap = 0, count = 0;
		
		
		while (realN <= MaxN) {
			scale = 1;
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
		}
		System.out.println(count);
	}

}