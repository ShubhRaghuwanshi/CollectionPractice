package PracticePrograms;

public class arraydemo {

	public static void main(String[] args) {
		 int rollno[]= {101, 102, 301, 401, 501};
		 
	//	 System.out.println("First element:" +rollno[0]); // this is one method to add elements
	//	 System.out.println("First element:" +rollno[1]);
	//	 System.out.println("First element:" +rollno[2]);
		 
		 for (int i=0; i<rollno.length; i++) {  // by for loop method we can add elements
			 System.out.println("from the for loop:" +rollno[i]);
		 }
		 System.out.println();
	//	 for (int i:rollno) {    // for each loop syntax 3rd method
	//		 System.out.println("from the for each loop:" +i);
	//	 }
	}
}
