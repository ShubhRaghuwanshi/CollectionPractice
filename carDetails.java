package PracticePrograms;

public class carDetails {
	
	String carName;
	String Brand;
	String price;
	int milage;
	
	void setcarname() {
		System.out.println("My car name is:" +carName);
	}
	void setbrand() {
		System.out.println("My cars brand is:" +Brand);
	}
	void setprice() {
		System.out.println("My cars Price is:" +price);
	}
	void setmilage() {
		System.out.println("My cars Milage is:" +milage);
	}

	public static void main(String[] args) {
		carDetails CD=new carDetails();
		carDetails CD1=new carDetails();
		carDetails CD2=new carDetails();
		
		CD.carName="Scprpio";
		CD.Brand="MAHINDRA";
		CD.milage=20;
		CD.price="15Lakh";
		
		CD1.carName="Vista";
		CD1.Brand="TATA";
		CD1.milage=22;
		CD1.price="9Lakh";
		
		CD2.carName="Amaze";
		CD2.Brand="HYUNDAI";
		CD2.milage=18;
		CD2.price="12Lakh";
		
		CD.setcarname();
		CD.setbrand();
		CD.setmilage();
		CD.setprice();
		System.out.println();
		CD1.setcarname();
		CD1.setbrand();
		CD1.setmilage();
		CD1.setprice();
		System.out.println();
		CD2.setcarname();
		CD2.setbrand();
		CD2.setmilage();
		CD2.setprice();

	}

}
