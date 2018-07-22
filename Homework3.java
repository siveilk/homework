package Homeworks123;

import java.util.Stack;

public class Homework3 {
	public static boolean isBalanced(String str) {
		char a;
		Stack<Character> sta = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			a = str.charAt(i);

			if (!sta.empty() && (a == ')' && sta.peek() == '(' || a == ']' && sta.peek() == '['
					|| a == '}' && sta.peek() == '{'))
				sta.pop();
			else
				sta.push(a);
		}
		return sta.empty();
	}

	public static void main(String[] args) {
		String[] examples = { "{{)(}}", "({)}", "[({})]", "{}([])", "{()}[[{}]]" };
		for (String example : examples) {
			System.out.println(example + ' ' + (isBalanced(example) ? "is" : "is not") + " balanced.");
		}

	}

}
