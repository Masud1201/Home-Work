package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe home = new AboutMe(); // constructor initialized
		home.name = "Masud Rana";// variable initialized
		home.age = 37;
		home.HouseRent = 1600;
		home.YearlySalary = 70000;
		home.BankBalance = 300l;
		home.myHeight = 5.5f;
		home.myGpa = 3.5;
		home.sex = 'M';
		home.usCitizen = true;
		home.aboutMe(); // method initialized
		System.out.println("\n--------------------------------------------------");

		AboutMe alex = new AboutMe(); // constructor initialized
		alex.name = "Alex";// variable initialized
		alex.age = 20;
		alex.HouseRent = 500;
		alex.YearlySalary = 80000;
		alex.BankBalance = 22300l;
		alex.myHeight = 6.0f;
		alex.myGpa = 4.0;
		alex.sex = 'M';
		alex.usCitizen = true;
		alex.aboutMe(); // method initialized
	}

}
