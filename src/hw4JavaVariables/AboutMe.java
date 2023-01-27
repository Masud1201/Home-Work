package hw4JavaVariables;

public class AboutMe {
	public String name;// variable declared
	public byte age;
	public short HouseRent;
	public int YearlySalary;
	public long BankBalance;
	public float myHeight;
	public double myGpa;
	public char sex = 'M';
	public boolean usCitizen;

	public AboutMe() {
		System.out.println("This is about us:");
	}

	public void aboutMe() {
		System.out.println("My Name:" + name + "\nMy Age:" + age + "\nMy House Rent:" + HouseRent + "\nMy YearlySalary:"
				+ YearlySalary + "\nMy BankBalance:" + BankBalance + "\nMy myHeight:" + myHeight + "\nMy my Gpa:"
				+ myGpa + "\nMy sex:" + sex + "\nMy usCitizen:" + usCitizen);
	}
}
