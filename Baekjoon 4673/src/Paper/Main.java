package Paper;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();				//오픈된 카드 갯수 입력
		int M = scan.nextInt();				//기준수 입력
		
		ArrayList<Integer> openCard = new ArrayList<>();
		ArrayList<Integer> combination = new ArrayList<>();
		
		for (int n = N; n > 0; n--) {      //오픈된 수 입력, 내림차순 정렬
			openCard.add(scan.nextInt());
		}
		openCard.sort(Comparator.reverseOrder());
		int i, j, k, sum;					//기준수보다 작은 숫자조합 중 최대 추출
		for (i = 0; i < openCard.size() - 2; i++) {
			for (j = i + 1; j < openCard.size() - 1; j++) {
				for (k = j + 1; k < openCard.size(); k++) {
					sum = openCard.get(i) + openCard.get(j) + openCard.get(k);
					if (sum <= M) {
						combination.add(sum);
						break;
					}
				}
			}
		}
		combination.sort(Comparator.reverseOrder());  //숫자조합들 중 최댓값 출력
		System.out.println(combination.get(0));
	}
}
