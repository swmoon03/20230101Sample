package dd;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> card = new ArrayList<>();
		for (int i = 0; i < N; i++) card.add(scan.nextInt());
		card.sort(Comparator.naturalOrder());
		int size = card.size();
		int mid = size / 2;
		int maxdummy = size;
		int mindummy = 0;
		int M = scan.nextInt();
		int[] distinct = new int[M], result = new int[M];
		for (int i = 0; i < M; i++) {
			distinct[i] = scan.nextInt();
			result[i] = 2;
		}
		for (int i = 0; i < M; i++) {	//이진 탐색
			mid = size / 2;
			maxdummy = size;
			mindummy = 0;
			while (result[i] >= 2) {
				if (distinct[i] > card.get(mid)) {
					mindummy = mid;
					mid = (mid + maxdummy) / 2;
				}
				else if (distinct[i] < card.get(mid)) {
					maxdummy = mid;
					mid = (mid + mindummy) / 2;
				}
				else result[i] = 1;
				if (mindummy == mid | maxdummy == mid) {
					if (result[i] == 3) result[i] = 0;
					else if (result[i] == 2) result[i] = 3;
				}
			}
		}
		for (int i = 0; i < M; i++) System.out.print(result[i] + " ");
	}	
}