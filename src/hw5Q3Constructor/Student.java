package hw5Q3Constructor;

public class Student {
	public String stName;// variable declared
	public int stId;
	public char sex = 'M';
	public boolean isProgrammer;
	public float grade;

	public Student() { // default Constructor declared

	}

	// parameterized constructor
	public Student(String stName, int stId, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stId = stId;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + " ,  Student ID: " + stId + ",  Student SEX:" + sex
				+ " ,  Student is Programmer: " + isProgrammer + " ,  Student grade: " + grade);

	}

}
