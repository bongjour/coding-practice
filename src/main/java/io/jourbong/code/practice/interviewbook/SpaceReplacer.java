package io.jourbong.code.practice.interviewbook;

public class SpaceReplacer {

	public static void main(String[] args) {
		String input = "ab cd ef   ";

		char[] chars = input.toCharArray();

		StringBuilder sb = new StringBuilder();
		for (int each : chars) {
			if (each == 32) {
				sb.append("%20");
			} else {
				sb.append((char) each);
			}
		}
		System.out.println(sb.toString());
	}
}
