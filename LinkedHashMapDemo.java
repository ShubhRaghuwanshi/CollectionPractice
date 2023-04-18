package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(1, "Shubha");
		lhm.put(2, "Shubham1");
		lhm.put(3, "Shubham2");
		lhm.put(4, "Shubham3");
		lhm.put(5, "Shubham4");
		lhm.put(6, "Shubham5");
		lhm.put(1, "Shubham4");
		
		for(Map.Entry<Integer, String> mm:lhm.entrySet()) {
			System.out.println("Key is:" +mm.getKey() +"Value is:" +mm.getValue());
		}
	}

}
