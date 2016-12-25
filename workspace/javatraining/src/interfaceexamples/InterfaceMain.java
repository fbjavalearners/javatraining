package interfaceexamples;

public class InterfaceMain {

	public static void main(String args[]){
		
		MathInterface sindImpl = new SindhMathImpl();
		MathInterface rajImpl = new RajivMathImpl();
		
		takeImplementor(sindImpl, 10, 20);
		//takeImplementor(rajImpl, 10, 20);
		
		
		
	}
	
	public static void takeImplementor(MathInterface m,int a, int b){
		 System.out.println(m.add(a, b));
	}
	
}
