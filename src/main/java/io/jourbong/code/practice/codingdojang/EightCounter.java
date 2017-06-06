package io.jourbong.code.practice.codingdojang;

import java.util.PriorityQueue;

/**
 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
 * 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
 * (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
 */
public class EightCounter {

	private static int totalCount = 0;

	public static void main(String[] args) {

		for (int i = 1; i <= 10000; i++) {
			countEight(i);
		}

		System.out.println(totalCount);
	}

	public static void countEight(int maxNumber) {

		if (maxNumber % 10 == 8) {
			totalCount++;
		}
		PriorityQueue queue = new PriorityQueue();
		if (maxNumber > 10) {
			countEight(maxNumber / 10);
		}

	}
}