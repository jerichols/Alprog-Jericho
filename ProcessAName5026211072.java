import java.util.Scanner;
public class ProcessAName5026211072{
	public static void main(String[]args){
		Scanner keyboardInput = new Scanner(System.in);

		System.out.print("Enter Your Name : ");
		String name = keyboardInput.nextLine();
		int space = name.indexOf(' ');
		String firstName = name.substring(0,1);
		space++;
		String lastName = name.substring(space);
		
		System.out.println("Your name is " +lastName+ ", " +firstName+ ".");
	}
}
	
	