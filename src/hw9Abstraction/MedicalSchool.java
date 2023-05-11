package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool{
	public MedicalSchool() {
	}
	
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is non abstract method of biochemistry lab");
	}
	}