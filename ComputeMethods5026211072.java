import java.util.Random;

public class ComputeMethods5026211072

{
	public double fToC(double degreesF){
		return 5/9.0 * (degreesF - 32);
	}
	
	public double hypotenuse(int a, int b){
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));	
	}
	
	public int roll (){
		Random rndNumber = new Random();
		int dice1 = rndNumber.nextInt(6) + 1;
		int dice2 = rndNumber.nextInt(6) + 1;	
		return dice1 + dice2;
	}
}