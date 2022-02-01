package functionalInterface;

@FunctionalInterface
public interface AuthanticateUser<T> {
	
	/**
	 * By default public static abstract
	 * */
	void validate ( T args );
	
	
	
	
}
