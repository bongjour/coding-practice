package io.jourbong.code.practice.beijing;

import java.util.Arrays;
import java.util.Stack;

/**
 * Sort a stack using recursion
 * http://opensourceforgeeks.blogspot.kr/2014/02/sort-stack-using-recursion-in-java.html
 */
public class StackSortRecursive {

	public void sortStack(Stack<Integer> stack) {
//1,2,3
		int no = stack.pop();
		if (stack.size() != 1) {
			sortStack(stack);
		}
		insert(stack, no);
	}

	private void insert(Stack<Integer> stack, int no) {

		if (stack.size() == 0) {
			stack.push(no);
		} else {
			int newPeakedNo = stack.peek();
			if (no >= newPeakedNo) {
				stack.push(no);
			} else {
				int newPoppedNo = stack.pop();
				insert(stack, no);
				stack.push(newPoppedNo);
			}
		}
	}

	public static void main(String args[]) {

		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(1);
		stack.push(7);
		stack.push(5);
		stack.push(3);
		stack.push(8);
		System.out.println("Stack Before Sort : " + Arrays.toString(stack.toArray()));
		new StackSortRecursive().sortStack(stack);
		System.out.println("Stack After Sort : " + Arrays.toString(stack.toArray()));

	}
}
