package hashmap;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(1, "Shubha");
		ht.put(2, "Krishna");
		ht.put(45, "Satish");
		ht.put(4, "Viraj");
		ht.put(5, "Zara");
		ht.put(6, "Yogi");
		ht.put(0, "pranav");

		
		for (Map.Entry<Integer, String> tmt:ht.entrySet()) {
			System.out.println("key is:" +tmt.getKey() +"Value is:" +tmt.getValue());
		}
	}

}
