
public class test05 {

	public static void newLine() {
		System.out.println("");

	}	
	
	public static void threeLine() {
		newLine(); newLine(); newLine();
//������ �ᵵ �� �� �� �� �ν� �Ǵ� ��?
	}
	
	public static void main(String[] args) {
		System.out.println("First line.");
		threeLine();
		System.out.println("Second line.");
	}

}
