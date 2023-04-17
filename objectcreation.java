package PracticePrograms;

public class objectcreation {
	String name="Shubham";
	int age=25;
	String mobileNo="8983551566";
	String aadharNo="855755";
	String pancardNo="bhsjd456446";
	
	void show() {
		System.out.println("My name is:" +name);
		System.out.println("My age is:" +age);
		System.out.println("My mobile no is:" +mobileNo);
		System.out.println("My aadhar card No is:" +aadharNo);
		System.out.println("My Pan card No is:" +pancardNo);
	}
	public static void main(String[] args) {
		objectcreation oc=new objectcreation();
		oc.show();
	}

}
