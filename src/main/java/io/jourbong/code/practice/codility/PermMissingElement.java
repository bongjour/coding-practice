package io.jourbong.code.practice.codility;

/**
 *
 * @author <a href=“mailto:inomy@coupang.com”>Dante</a>
 * @since 2017. 6. 1.
 */
public class PermMissingElement {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int exam[] = { 2, 6, 1, 3, 5 };
		System.out.println(solution.solution(exam));
	}

	public static class Solution {

		public int solution(int[] a) {

			boolean occurred[] = new boolean[a.length + 2];

			for (int i = 0; i < a.length; i++) {
				occurred[a[i]] = true;
			}

			for (int i = 1; i < occurred.length; i++) {
				if (!occurred[i]) {
					return i;
				}
			}

			throw new IllegalStateException("Not Found");
		}
	}
}
