package PracticePrograms;

public class stringtypes {
	
	public static void main(String[] args) {
		
		String s1="shubham";
		String s2="Bhokar";
		String s3="bhokar";
		String s4="8983551566";
		String s5="shubham";
		String s6="SHUBHAM";
		
		String str=new String("Shubham");
		String str1=new String("shubham");
		String str2=new String("8983551566");
		String str3=new String("Bhokar");
		String str4=new String("8983551");
		
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s5==s6);
		System.out.println(str.equals(s1));
		System.out.println(str1.equals(s5));
		System.out.println(str2.equals(str4));
		System.out.println(str2.equals(s4));
		System.out.println(str3==s1);
	}

}
