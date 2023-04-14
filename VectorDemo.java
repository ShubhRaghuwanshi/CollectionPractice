package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> Name=new Vector<>();
		Name.add("Shubham");
		Name.add("AArya");
		Name.add("Shiva");
		Name.add("Yash");
		
		Iterator<String> itr=Name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
