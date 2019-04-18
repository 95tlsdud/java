
public class test05 {

	public static void newLine() {
		System.out.println("");

	}	
	
	public static void threeLine() {
		newLine(); newLine(); newLine();
//옆으로 써도 한 줄 한 줄 인식 되는 듯?
	}
	
	public static void main(String[] args) {
		System.out.println("First line.");
		threeLine();
		System.out.println("Second line.");
	}

}
