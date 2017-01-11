package jrout.tutorial.corejava.exceptiondemo;

public class UserDefinedInputException extends Exception {
	private String message;
	
	public UserDefinedInputException(String message) {
		super(message);
		this.message = message;
	}
	
	
	@Override
	public String toString() {
		
		return "UserDefinedInputException. "+ message;
	}
}
