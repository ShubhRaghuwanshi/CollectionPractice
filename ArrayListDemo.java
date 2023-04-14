package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> studList=new ArrayList<>();
		studList.add(100);
		studList.add(200);
		studList.add(300);
		studList.add(500);
		studList.add(1000);
		studList.add(11215);
		studList.add(200);
		studList.add(300);
		
		System.out.println(studList.size());
		System.out.println(studList.isEmpty());
		System.out.println();
//		Iterator<Integer> irr=studList.iterator();
//		while (irr.hasNext()) {
//			System.out.println(irr.next());
			
			for (int i:studList) {
				System.out.println(i);
			}
		}
	}
