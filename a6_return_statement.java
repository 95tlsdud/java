
public class a6_return_statement {

	public static void printLogarithm(double x) {
		if (x <= 0.0) {
			System.out.println("Positive number only, please");
			return;	
		}
		
		double result = Math.log(x);
		System.out.println("The log of x is " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLogarithm(5);

	}

}
