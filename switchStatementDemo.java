package ControlStatements;

public class switchStatementDemo {
	
	static void checkSalarySlab(String PostName) {
		switch(PostName) 
		{
		case "Class 1":
			System.out.println("Salary slab between 1.5-2 lakhs");
			break;
			
		case "Class 2":
			System.out.println("Salary slab between 1-1.5 lakhs");
			break;
			
		case "Class 3":
			System.out.println("Salary slab between1-70k ");
			break;
			
		case "Class 4":
			System.out.println("Salary slab between 70-40k");
			break;
			
		default:
			System.out.println("Please enetr correct Designation");
		}
	}
	public static void main(String[] args) {
		System.out.println("First metthod");
		checkSalarySlab("Class 1");
		System.out.println();
		System.out.println("Second metthod");
		checkSalarySlab("Class 2");
		System.out.println();
		System.out.println("Third metthod");
		checkSalarySlab("Class 3");
		System.out.println();
		System.out.println("Fourth metthod");
		checkSalarySlab("Class 4");
		System.out.println();
		System.out.println("Fifth metthod");
		checkSalarySlab("Class 7");
	}

}
