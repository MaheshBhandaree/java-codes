package ass;

public class PassToShortException extends Exception
{
	private String message;

	public PassToShortException(String message) {
		super();
		this.message = "The password is two short it is less than 8 char";
	}

	

	@Override
	public String toString() {
		return "PassToShortException [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
