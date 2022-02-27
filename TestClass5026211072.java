

public class TestClass5026211072{
	public static void main(String[]args){

		ComputeMethods5026211072 cM = new ComputeMethods5026211072();
		double celcius = cM.fToC(120);
		System.out.println("120 F = "+ celcius + " C");
		
		double hypotenuse = cM.hypotenuse(8,14);
		System.out.println("hypotenuse of 8 and 14 = "+hypotenuse);
		
		int rollDice = cM.roll();
		System.out.println("The result of 2 Dice Roll: "+rollDice);
	}
}