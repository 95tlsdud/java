
public class a5_nested_conditionals {

	public static void nested(int x) {
		if (x == 0) {
			System.out.println("x is zero");
		} else {
		  if (x > 0) {
			  System.out.println("x is positive");
		  } else {
			  System.out.println("x is negative");
		  }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nested(-5);
	}

}
