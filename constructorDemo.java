package PracticePrograms;

public class constructorDemo {
	
	String name;
	String designation;
	int experiance;
	String companyName;
	
	constructorDemo() {
		System.out.println("This is non parameterised constructor");
		System.out.println("consructor name is same as class name");
		companyName="Shubham";
	}
	constructorDemo (String nm, String ds, int ep){
		name=nm;
		designation=ds;
		experiance=ep;
		
	}
	void display() {
		System.out.println("My name is:" +name);
		System.out.println("My designation is:" +designation);
		System.out.println("My experiance is:" +5);
	}
	public static void main(String[] args) {
		constructorDemo CD=new constructorDemo();
		System.out.println("company name=" +CD.companyName);
		
		
		constructorDemo CD1=new constructorDemo();
		CD1.name="jobiti";
		CD1.designation="QA";
		CD1.experiance=5;
		CD1.display();
	}

}
