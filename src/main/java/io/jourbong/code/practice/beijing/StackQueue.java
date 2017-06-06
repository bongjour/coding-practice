package io.jourbong.code.practice.beijing;

import java.util.Stack;

public class StackQueue {

	Stack<Integer> pushStack = new Stack<>();
	Stack<Integer> popStack = new Stack<>();

	public void push(Integer item) {
		pushStack.push(item);
	}

	public Integer pop() {
		if (popStack.size() <= 0) {
			while(pushStack.size() > 0) {
				popStack.push(pushStack.pop());
			}
		}
		return popStack.pop();
	}

	public int size() {
		return pushStack.size() + popStack.size();
	}

	public static void main(String[] args) {
		StackQueue stackQueue = new StackQueue();
		stackQueue.push(1);
		stackQueue.push(2);
		stackQueue.push(3);
		stackQueue.push(4);
		stackQueue.push(5);

		for (int i = 0; i < 5; i++) {
			System.out.println(stackQueue.pop());
		}
	}
}
