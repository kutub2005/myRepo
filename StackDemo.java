package myFirstPackage;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	// Last-in-First-out (LIFO), note: Top of the stack is the Last item in memory
		// to
		Stack<String> stk = new Stack<String>();
		
		stk.add("rajendra");
		stk.add("dijendra");
		stk.add("sapin");
		stk.add("uttar");
		stk.add("nepal");
		stk.add("kalam");
		stk.add("nikhil");
		stk.add("kutub");
		stk.add("samir");

		System.out.println(stk);
	}

}
