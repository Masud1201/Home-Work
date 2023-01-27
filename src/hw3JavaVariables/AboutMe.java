package hw3JavaVariables;

public class AboutMe {
	public String myName; // variable declared
	public String name = "Masud Rana"; // variable initialized

	public byte age =37; // variable initialized
	public short HouseRent = 2000;
	public int YearlySalary = 70000;
	public long BankBalance = 100l; 
	public float myHeight = 77.03f; 
	public double myGpa = 3.01;
	public char sex ='M';
	public boolean usCitizen = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.sex);
		System.out.println("My Name:"+aboutMe.name + "\nMy Age:"+aboutMe.age + "\nMy sex:"+aboutMe.sex); // this line use String concatenation
		
	}
}