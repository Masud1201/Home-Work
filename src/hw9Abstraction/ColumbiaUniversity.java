package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	public void biology() {
		System.out.println("This not abstract method"); //abstract method cannot be declared inside the Class because regular class can only contain implemented method. 
	}
	public ColumbiaUniversity() {
	}
	@Override
	public void anatomyLab() {  // TODO Auto-generated method stub
	}
	@Override
	public void hygiene() {  // TODO Auto-generated method stub	
	}
}
