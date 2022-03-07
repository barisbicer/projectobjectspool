package stack;

import java.util.Stack;

public class Test2 {
	
	public static boolean hasMatchingParanthese(String s) {
		
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char current =s.charAt(i);
			if(current=='(') {
				stack.push(current);
		 	}else if(current ==')') {
		 		if(!stack.isEmpty()) {
		 			stack.pop();
		 		}else {
		 			return false;
		 		}
		 	}
		}
		
		return stack.isEmpty();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasMatchingParanthese("((fffffff))"));

	}

}
