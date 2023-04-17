package PracticePrograms;

public class encapsulationDemo {
	
	private String loginId;
	private String passward;
	
	void setloginId (String i) {
		loginId=i;
		System.out.println("LoginId is:" +loginId);
	}
	void setpassward (String p) {
		passward=p;
		System.out.println("Passward is:" +passward);
	}
	String getloginId() {
		return loginId;
	}
	String getpassward() {
		return passward;
	}
	public static void main(String[] args) {
		encapsulationDemo END=new encapsulationDemo();
		END.setloginId("Shubhbham");
		END.setpassward("Shubh8989");
	}

}
