
public class ex_4_1 {

	public static void newLine() {
		System.out.println("");
	}
	
	public static void threeLine() {
		newLine(); newLine(); newLine();
	}
	
	public static void nLines(int n) {
		if (n > 0) {
			System.out.println("");
			nLines(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nLines(4);

	}

}
