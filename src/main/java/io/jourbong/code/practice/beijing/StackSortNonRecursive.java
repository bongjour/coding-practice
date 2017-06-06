package io.jourbong.code.practice.beijing;

import java.util.Arrays;
import java.util.Stack;

public class StackSortNonRecursive {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(1);
		stack.push(7);
		stack.push(5);
		stack.push(3);
		stack.push(8);
		System.out.println("Stack Before Sort : " + Arrays.toString(stack.toArray()));
		Stack<Integer> sortedStack = new StackSortNonRecursive().sortStack(stack);
		System.out.println("Stack After Sort : " + Arrays.toString(sortedStack.toArray()));
	}

	public Stack<Integer> sortStack(Stack<Integer> stack) {

		Stack<Integer> result = new Stack<>();

		while (!stack.isEmpty()) {

			int tmp = stack.pop();

			while(!result.isEmpty() && result.peek() > tmp) {
				stack.push(result.pop());
			}

			result.push(tmp);
		}

		return result;
	}
}
