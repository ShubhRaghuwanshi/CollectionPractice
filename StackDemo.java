package Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> Name=new Stack<>();
		Name.add("Shubham");
		Name.add("AArya");
		Name.add("Shiva");
		Name.add("Yash");
		Name.add("krishna");
		
		Name.pop();
		Name.pop();

		Iterator<String> itr=Name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
