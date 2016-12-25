package interfaceexamples;

/*
 *  By default methods in interface are public and abstract
 *  By deault variables defined in interface are public static final
 *  you can add default or public modifier to interface
 *  eg public interface 
 * 
 * 
 */

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
