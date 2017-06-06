package io.jourbong.code.practice.beijing;

/**
 * Created by coupang on 2017. 3. 7..
 */
public class FindDuplicated {

	public static void main(String[] args) {

		int[] input = new int[] { 13, 1, 1, 2, 3, 7, 7, 8, 9, 9, 9, 13, 10, 13 };
		removeDuplicated(input);
	}

	private static void removeDuplicated(int[] input) {
		int current = input[0];
		boolean found = false;

		for (int i = 0; i < input.length; i++) {
			if (current == input[i] && !found) {
				found = true;
			} else if (current != input[i]) {
				System.out.print(" " + current);
				current = input[i];
				found = false;
			}
		}

	}
}
