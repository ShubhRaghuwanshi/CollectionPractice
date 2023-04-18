package hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<>();
		tm.put(1, "Shubha");
		tm.put(2, "Krishna");
		tm.put(45, "Satish");
		tm.put(4, "Viraj");
		tm.put(5, "Zara");
		tm.put(6, "Yogi");
		tm.put(0, "pranav");
		
		for (Map.Entry<Integer, String> tmm:tm.entrySet()) {
			System.out.println("key is:" +tmm.getKey() +"Value is:" +tmm.getValue());
		}
	}

}
