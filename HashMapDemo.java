package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Shubham");	//bunch of elements--node
		hm.put(2, "Shubh");
		hm.put(3, "Yash");
		hm.put(4, "Aarya");
		hm.put(5, "Veer");
		hm.put(6, "Adit");
		hm.put(7, "Aku");
		
		// how to iterate map
	//	Map.Entry<K, V>  // 1st method
		
		
		for (Map.Entry<Integer, String> hmm:hm.entrySet()) {
			System.out.println("Key is:" +hmm.getKey() +"Value is:" +hmm.getValue());
		}
	}

}
