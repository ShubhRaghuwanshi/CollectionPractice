package PracticePrograms;

public class gradingSystem {
	static void GradingofStudents (String StudGrade) {
		switch (StudGrade) {
		case "Distinction":
			System.out.println("percentage 75-100");
			break;
			
		case "First class":
			System.out.println("percentage 60-75");
			break;
			
		case "Second class":
			System.out.println("percentage 50-60");
			break;
			
		case "Third class":
			System.out.println("percentage 35-50");
			break;
			
		case "Fail":
			System.out.println("percentage 0-35");
			break;
		
		default:
			System.out.println("Pleade fill proper marks ");
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("First method");
		GradingofStudents("85");
		System.out.println();
		System.out.println("Second method");
		GradingofStudents("75");
		System.out.println();
		System.out.println("Third method");
		GradingofStudents("65");
		System.out.println();
		System.out.println("Fourth method");
		GradingofStudents("45");
		System.out.println();
		System.out.println("Fifth method");
		GradingofStudents("35");
		System.out.println();
		System.out.println("Sixth method");
		GradingofStudents("15");
		System.out.println();
		System.out.println("Seventh method");
		GradingofStudents("112");
		System.out.println();
		
	}

}
