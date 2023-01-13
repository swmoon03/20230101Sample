package fsdf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		int[] result = new int[test];
		int x1, y1, r1, x2, y2, r2, rdummy;
		double distance;
		for (int i = 0; i < test; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			r1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			r2 = scan.nextInt();
			if (r1 > r2) {							   // r2가 r1보다 항상 크도록 정렬
				rdummy = r1;
				r1 = r2;
				r2 = rdummy;
			}
			distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			if (distance == 0) {					   // 중심, 반지름이 모두 같은 경우
				if (r1 == r2) result[i] = -1;
				else if (r1 != r2) result[i] = 0;
			}										   // 각 원이 다른 원의 중심을 포함하지 않는 경우
			else if (distance >= r2) {
				if (distance > r1 + r2) result[i] = 0;
				else if (distance == r1 + r2) result[i] = 1;
				else if (distance < r1 + r2) result[i] = 2;
			}
			else if ((distance <= r1 && distance != 0) | (distance > r1 && distance < r2)) {
				if (distance + r1 < r2) result[i] = 0;
				else if (distance + r1 == r2) result[i] = 1;
				else if (distance + r1 > r2) result[i] = 2;
			}
		}
		for (int i = 0; i < test; i++) System.out.println(result[i]);
	}
}
