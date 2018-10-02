import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

//everett yang 111756324
public class MatchParens {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(new File(args[0]));
		String s = "";
		while (in.hasNext())
			s += in.nextLine() + "\n";
		s = s.replaceAll("\'[\\(\\[\\{\\}\\]\\)]\'", "");
		in.close();
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			if(c == ')')
				if(stack.pop() != '(') {
					System.out.println("Wrong :^(");
					return;
				}
				else {
					System.out.println("Good! :^)");
				}
			if(c == ']')
				if(stack.pop() != '[') {
					System.out.println("Wrong :^(");
					return;
				}
				else {
					System.out.println("Good! :^)");
				}
			if(c == '}')
				if(stack.pop() != '{') {
					System.out.println("Wrong :^(");
					return;
				}
				else {
					System.out.println("Good! :^)");
				}
		}
		
	}
}
