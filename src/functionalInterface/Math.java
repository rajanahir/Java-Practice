package functionalInterface;

/**
 * @author q1047977
 *
 */
public class Math {
	
	public static void main(String[] args) {
		/***
		 * Providing the body for abstarct method of Cube functional interface.
		 * */
		Cube cubeObj = ( c ) -> c * c * c;
		
		/**
		 * Executing the above provide logic to Cube functional interface.
		 * */
		int cube = cubeObj.compute(3);
		System.out.println( cube );
	}

}
