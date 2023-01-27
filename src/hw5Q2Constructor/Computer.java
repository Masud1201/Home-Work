package hw5Q2Constructor;

public class Computer {
	public String brand;// variable declared
	public String modele;
	public String operatingSystem;
	public int price;
	public char grade = 'M';
	public boolean madeInUSA;

	public Computer() { // default Constructor declared
		// System.out.println("This is about a car:");
	}

	public Computer(String brand, String modele, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.modele = modele;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Brand: " + brand + " Modele: " + modele + " operatingSystem: " + operatingSystem + "price: "
				+ price + " grade: " + grade + " Made: " + madeInUSA);

	}
}
