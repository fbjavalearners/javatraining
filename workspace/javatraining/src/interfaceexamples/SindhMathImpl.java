package interfaceexamples;

public class SindhMathImpl implements MathInterface{

	@Override
	public int add(int a, int b) {
		return a+b+a;
		
	}

	@Override
	public int Subtract(int a, int b) {
		return a-b+a;
		
	}
	
}
