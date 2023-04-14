package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSet {

	public static void main(String[] args) {
		LinkedHashSet<String> Name=new LinkedHashSet<>();
		Name.add("Shubham");
		Name.add("AArya");
		Name.add("Shiva");
		Name.add("");
		Name.add("Yash");
		Name.add("krishna");
		Name.add("");
		Name.add("Shubham");
		
		Iterator<String> itr=Name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
