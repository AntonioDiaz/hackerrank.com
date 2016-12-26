package algorithms.warmup.easy;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= 0; j--) {
				System.out.print(j>i?" ":"#");
			}
			System.out.println("");
		}
		in.close();
	}
}
