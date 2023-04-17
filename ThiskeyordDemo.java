package PracticePrograms;

public class ThiskeyordDemo {
	
	int age;
	String name;
	
	void set (int age, String name) {
		this.age=age;
		this.name=name;
	}
	void display () {
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String[] args) {
		ThiskeyordDemo TD=new ThiskeyordDemo();
		TD.set(25, "Practice");
		TD.display();
	}

}
