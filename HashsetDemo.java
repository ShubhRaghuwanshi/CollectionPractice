package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<String> Name=new HashSet<>();
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
