package functionalInterface;

public class NumericPassword implements AuthanticateUser<Integer> {

	@Override
	public void validate(Integer args) {
		// TODO Auto-generated method stub
		System.out.println("Number passwrod validated!!");
	}
	
	
}
