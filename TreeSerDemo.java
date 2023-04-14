package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSerDemo {

	public static void main(String[] args) {
		TreeSet<String> Name=new TreeSet<>();
		Name.add("Shubham");
		Name.add("AArya");
		Name.add("Shiva");
		Name.add("");
		Name.add("Yash");
		Name.add("");
		Name.add("Shubham");
		Name.add("Zara");
		Name.add("Xerox");
		Name.add("Krishna");
		
		Iterator<String> itr=Name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
