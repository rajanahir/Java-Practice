package functionalInterface;

public class ValidatePassword {
	
	public static void main(String[] args) {
		StringPassword sp = new StringPassword();
		sp.validate("ABC12345");
		System.out.println(sp.i);
		
		NumericPassword np = new NumericPassword();
		np.validate(123456);
		
	
		/**
		 * Calling using lambda expression
		 * */
		AuthanticateUser<String> au = ( str ) -> System.out.println("Stirng passwords validated uisng lambda!! " + str);
		au.validate("ABCDEF");
		
		
	}

}
