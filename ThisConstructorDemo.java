package PracticePrograms;

public class ThisConstructorDemo {
	int a;
	int b;
	String name;
	
	ThisConstructorDemo (int a, int b){
		this.a=a;
		this.b=b;
	}
	ThisConstructorDemo (String name){
		this.name=name;
	}
	void display () {
		System.out.println("value of a is: "+a);
		System.out.println("value of b is:" +b);
		System.out.println("My name is:" +name);
	}

	public static void main(String[] args) {
		ThisConstructorDemo tc=new ThisConstructorDemo(25, 56);
				tc.display();
		ThisConstructorDemo tc1=new ThisConstructorDemo("Shubham");
				tc1.display();
	}
}
