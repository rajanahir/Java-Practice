package functionalInterface;

public class StringPassword implements AuthanticateUser<String> {
	
	protected int i;
	
	@Override
	public void validate(String  args) {
		// TODO Auto-generated method stub
		System.out.println("Stirng password validated!!");
	}
	

}
