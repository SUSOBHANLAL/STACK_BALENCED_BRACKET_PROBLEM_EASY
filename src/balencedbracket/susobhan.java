package balencedbracket;
import java.util.*;
public class susobhan {
	 public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<>();
	        for (int i=0;i<s.length();i++) {
	        	char c = s.charAt(i);
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	                
	            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	                
	            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	                
	            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	                
	            } else {
	                return false;
	            }
	        }
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        String s1 = "((()))";
	        String s2 = "()[]{}";
	        String s3 = "([)]";
	        String s4 = "{[]}";
	        System.out.println(isBalanced(s1)); // true
	        System.out.println(isBalanced(s2)); // true
	        System.out.println(isBalanced(s3)); // false
	        System.out.println(isBalanced(s4)); // true
	    }

}
