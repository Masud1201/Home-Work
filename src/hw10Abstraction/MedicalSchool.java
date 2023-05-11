package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public MedicalSchool() { // This is default constructor

	}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is non abstract method of biochemistry lab");
	}

}