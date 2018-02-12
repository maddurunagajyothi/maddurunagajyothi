package collections;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("java");
		s.push("Abc");
		s.push("A");
		System.out.println(s);
		s.pop();
		s.empty();
		System.out.println(s.search("A"));
		s.peek();
		System.out.println(s);
		System.out.println(s.search("s"));

	}

}
