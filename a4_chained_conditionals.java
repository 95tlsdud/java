
public class a4_chained_conditionals {

	public static void chain(int x) {
		if (x > 0) {
			System.out.println("x is positive");
		} else if (x < 0) {
			System.out.println("x is negative");
		} else {
			System.out.println("x is zero");
		}
	}

	public static void main(String[] args) {
		chain(5);
	}
	
}

