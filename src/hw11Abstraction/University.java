package hw11Abstraction;

public interface University extends College,Hospital {
	public void classSize();
	public void playGround();
	public void teacher();
	default void gymnasium() {
		System.out.println("This default method gymnasium from University Interface");
	}
		public static void library() {
			System.out.println("This static method library from University Interface");
	}
}